package com.paryavaran.kavalu.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.paryavaran.kavalu.databinding.ActivitySplashBinding
import com.paryavaran.kavalu.ui.home.HomeActivity
import com.paryavaran.kavalu.utils.PermissionManager

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivitySplashBinding.inflate(layoutInflater).also { setContentView(it.root) }

        // Request permissions with a user-friendly dialog
        PermissionManager.requestPermissions(this) { allGranted ->
            // After permissions are handled (granted or denied), proceed to home
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this@SplashActivity, HomeActivity::class.java))
                finish()
            }, 1000)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PermissionManager.PERMISSION_REQUEST_CODE) {
            PermissionManager.handlePermissionResult(grantResults, permissions)
        }
    }
}
