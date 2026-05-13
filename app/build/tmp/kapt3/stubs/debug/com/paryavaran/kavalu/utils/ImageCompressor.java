package com.paryavaran.kavalu.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import kotlinx.coroutines.Dispatchers;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/paryavaran/kavalu/utils/ImageCompressor;", "", "()V", "MAX_SIDE", "", "MAX_SIZE_KB", "compressImage", "Ljava/io/File;", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", "targetSizeKB", "(Landroid/content/Context;Landroid/net/Uri;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resizeBitmap", "Landroid/graphics/Bitmap;", "bitmap", "maxWidth", "maxHeight", "rotateImageIfRequired", "uri", "writeCompressed", "app_debug"})
public final class ImageCompressor {
    private static final int MAX_SIZE_KB = 500;
    private static final int MAX_SIDE = 1024;
    @org.jetbrains.annotations.NotNull()
    public static final com.paryavaran.kavalu.utils.ImageCompressor INSTANCE = null;
    
    private ImageCompressor() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object compressImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri imageUri, int targetSizeKB, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.io.File> $completion) {
        return null;
    }
    
    private final android.graphics.Bitmap resizeBitmap(android.graphics.Bitmap bitmap, int maxWidth, int maxHeight) {
        return null;
    }
    
    private final android.graphics.Bitmap rotateImageIfRequired(android.content.Context context, android.graphics.Bitmap bitmap, android.net.Uri uri) {
        return null;
    }
    
    private final java.io.File writeCompressed(android.content.Context context, android.graphics.Bitmap bitmap, int targetSizeKB) {
        return null;
    }
}