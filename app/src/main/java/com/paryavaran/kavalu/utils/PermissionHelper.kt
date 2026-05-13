package com.paryavaran.kavalu.utils

import android.Manifest
import android.os.Build

object PermissionHelper {
    val reportPermissions: Array<String>
        get() = buildList {
            add(Manifest.permission.ACCESS_FINE_LOCATION)
            add(Manifest.permission.ACCESS_COARSE_LOCATION)
            add(Manifest.permission.CAMERA)
            if (Build.VERSION.SDK_INT >= 33) add(Manifest.permission.READ_MEDIA_IMAGES)
        }.toTypedArray()
}
