package com.paryavaran.kavalu.ui.settings

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation
import com.paryavaran.kavalu.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    private var selectedPhoto: Uri? = null
    private val photoPicker = registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        selectedPhoto = uri
        uri?.let {
            try {
                contentResolver.takePersistableUriPermission(it, Intent.FLAG_GRANT_READ_URI_PERMISSION)
            } catch (_: Exception) {
            }
            binding.ivProfilePhoto.load(it) {
                transformations(CircleCropTransformation())
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.setNavigationOnClickListener { finish() }

        val prefs = getSharedPreferences("profile", MODE_PRIVATE)
        binding.etProfileName.setText(prefs.getString("name", "Environmental Warrior"))
        prefs.getString("photo", null)?.let {
            selectedPhoto = Uri.parse(it)
            binding.ivProfilePhoto.load(selectedPhoto) {
                transformations(CircleCropTransformation())
            }
        }

        binding.btnChangePhoto.setOnClickListener { photoPicker.launch("image/*") }
        binding.btnSaveProfile.setOnClickListener {
            val name = binding.etProfileName.text.toString().trim().ifBlank { "Environmental Warrior" }
            prefs.edit()
                .putString("name", name)
                .putString("photo", selectedPhoto?.toString())
                .apply()
            Toast.makeText(this, "Profile updated", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
