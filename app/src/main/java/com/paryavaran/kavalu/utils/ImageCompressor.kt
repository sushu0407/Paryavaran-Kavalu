package com.paryavaran.kavalu.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.ExifInterface
import android.net.Uri
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream

object ImageCompressor {
    private const val MAX_SIZE_KB = 500
    private const val MAX_SIDE = 1024

    suspend fun compressImage(context: Context, imageUri: Uri, targetSizeKB: Int = MAX_SIZE_KB): File? =
        withContext(Dispatchers.IO) {
            try {
                val source = context.contentResolver.openInputStream(imageUri).use { BitmapFactory.decodeStream(it) }
                val resized = resizeBitmap(source, MAX_SIDE, MAX_SIDE)
                val rotated = rotateImageIfRequired(context, resized, imageUri)
                val result = writeCompressed(context, rotated, targetSizeKB)
                if (source !== resized) source.recycle()
                if (resized !== rotated) resized.recycle()
                result
            } catch (_: Exception) {
                null
            }
        }

    private fun resizeBitmap(bitmap: Bitmap, maxWidth: Int, maxHeight: Int): Bitmap {
        if (bitmap.width <= maxWidth && bitmap.height <= maxHeight) return bitmap
        val scale = minOf(maxWidth.toFloat() / bitmap.width, maxHeight.toFloat() / bitmap.height)
        return Bitmap.createScaledBitmap(bitmap, (bitmap.width * scale).toInt(), (bitmap.height * scale).toInt(), true)
    }

    private fun rotateImageIfRequired(context: Context, bitmap: Bitmap, uri: Uri): Bitmap {
        val orientation = context.contentResolver.openInputStream(uri).use {
            it?.let { stream -> ExifInterface(stream).getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL) }
        } ?: ExifInterface.ORIENTATION_NORMAL
        val degrees = when (orientation) {
            ExifInterface.ORIENTATION_ROTATE_90 -> 90f
            ExifInterface.ORIENTATION_ROTATE_180 -> 180f
            ExifInterface.ORIENTATION_ROTATE_270 -> 270f
            else -> return bitmap
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, Matrix().apply { postRotate(degrees) }, true)
    }

    private fun writeCompressed(context: Context, bitmap: Bitmap, targetSizeKB: Int): File {
        val output = File(context.filesDir, "report_${System.currentTimeMillis()}.jpg")
        var quality = 100
        var bytes: ByteArray
        do {
            val stream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, stream)
            bytes = stream.toByteArray()
            quality -= 10
        } while (bytes.size / 1024 > targetSizeKB && quality >= 10)
        FileOutputStream(output).use { it.write(bytes) }
        return output
    }
}
