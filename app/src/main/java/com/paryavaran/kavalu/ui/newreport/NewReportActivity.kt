package com.paryavaran.kavalu.ui.newreport

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.paryavaran.kavalu.databinding.ActivityNewReportBinding
import com.paryavaran.kavalu.ui.mapview.MapViewActivity
import com.paryavaran.kavalu.utils.LocationHelper
import com.paryavaran.kavalu.utils.PermissionHelper
import dagger.hilt.android.AndroidEntryPoint
import java.io.File
import android.content.Intent

@AndroidEntryPoint
class NewReportActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewReportBinding
    private val viewModel: NewReportViewModel by viewModels()
    private var cameraUri: Uri? = null
    private val permissionLauncher = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { viewModel.fetchCurrentLocation() }
    private val takePicture = registerForActivityResult(ActivityResultContracts.TakePicture()) { success ->
        if (success) {
            viewModel.setPhotoUri(cameraUri)
            binding.ivPhoto.setImageURI(cameraUri)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewReportBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.setNavigationOnClickListener { finish() }
        binding.spinnerWasteType.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listOf("Select waste type", "Plastic Waste", "Organic Waste", "Electronic Waste", "Construction Debris", "Mixed Waste", "Other"))
        binding.btnRefreshLocation.setOnClickListener {
            if (LocationHelper.hasLocationPermission(this)) viewModel.fetchCurrentLocation() else permissionLauncher.launch(PermissionHelper.reportPermissions)
        }
        binding.btnCapturePhoto.setOnClickListener {
            val file = File(cacheDir, "camera_${System.currentTimeMillis()}.jpg")
            cameraUri = FileProvider.getUriForFile(this, "$packageName.fileprovider", file)
            cameraUri?.let { takePicture.launch(it) }
        }
        binding.btnSubmit.setOnClickListener {
            viewModel.submitReport(binding.spinnerWasteType.selectedItem.toString(), binding.etDescription.text.toString())
        }
        viewModel.currentLocation.observe(this) { (lat, lon) ->
            binding.tvLocation.text = "Step 1: Capture Location\n${LocationHelper.formatCoordinates(lat, lon)}"
        }
        viewModel.isLoading.observe(this) { binding.progressBar.visibility = if (it) View.VISIBLE else View.GONE }
        viewModel.errorMessage.observe(this) { Toast.makeText(this, it, Toast.LENGTH_SHORT).show() }
        viewModel.submitSuccess.observe(this) {
            if (it) {
                Toast.makeText(this, "Report submitted. +10 Eco-Karma", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MapViewActivity::class.java))
                finish()
            }
        }
        permissionLauncher.launch(PermissionHelper.reportPermissions)
    }
}
