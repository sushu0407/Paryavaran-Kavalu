package com.paryavaran.kavalu.utils

import android.Manifest
import android.app.AlertDialog
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import android.os.Build

object PermissionManager {
    const val PERMISSION_REQUEST_CODE = 1001
    private var permissionCallback: ((allGranted: Boolean) -> Unit)? = null

    // List of all required permissions
    private val REQUIRED_PERMISSIONS = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.POST_NOTIFICATIONS,
            Manifest.permission.READ_MEDIA_IMAGES
        )
    } else {
        arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.READ_EXTERNAL_STORAGE
        )
    }

    fun getPermissionsToRequest(context: Context): List<String> {
        return REQUIRED_PERMISSIONS.filter {
            ContextCompat.checkSelfPermission(context, it) != PackageManager.PERMISSION_GRANTED
        }
    }

    fun hasAllPermissions(context: Context): Boolean {
        return getPermissionsToRequest(context).isEmpty()
    }

    fun requestPermissions(activity: AppCompatActivity, callback: ((allGranted: Boolean) -> Unit)? = null) {
        val permissionsToRequest = getPermissionsToRequest(activity)

        if (permissionsToRequest.isEmpty()) {
            callback?.invoke(true)
            return
        }

        // Store callback for later
        permissionCallback = callback

        // Show dialog explaining why we need permissions
        val permissionDescriptions = mapOf(
            Manifest.permission.CAMERA to "Camera - Required to take photos of pollution reports",
            Manifest.permission.ACCESS_FINE_LOCATION to "Fine Location - Required to show your location on map",
            Manifest.permission.ACCESS_COARSE_LOCATION to "Coarse Location - Required to show your approximate location",
            Manifest.permission.POST_NOTIFICATIONS to "Notifications - To send you updates about reports",
            Manifest.permission.READ_MEDIA_IMAGES to "Photos - To select images from your gallery"
        )

        val neededDescriptions = permissionsToRequest.mapNotNull { permissionDescriptions[it] }.joinToString("\n• ")

        AlertDialog.Builder(activity)
            .setTitle("App Permissions Required")
            .setMessage("Hi! 👋\n\nWe need the following permissions to help you track and clean pollution:\n\n• $neededDescriptions")
            .setPositiveButton("Allow") { _, _ ->
                ActivityCompat.requestPermissions(
                    activity,
                    permissionsToRequest.toTypedArray(),
                    PERMISSION_REQUEST_CODE
                )
            }
            .setNegativeButton("Later") { _, _ ->
                permissionCallback?.invoke(false)
                permissionCallback = null
            }
            .setCancelable(false)
            .show()
    }

    fun handlePermissionResult(
        grantResults: IntArray,
        permissions: Array<String>
    ) {
        val allGranted = grantResults.all { it == PackageManager.PERMISSION_GRANTED }
        permissionCallback?.invoke(allGranted)
        permissionCallback = null
    }
}
