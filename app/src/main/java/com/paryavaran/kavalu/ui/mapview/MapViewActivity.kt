package com.paryavaran.kavalu.ui.mapview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.paryavaran.kavalu.R
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.databinding.ActivityMapViewBinding
import com.paryavaran.kavalu.ui.reportdetails.ReportDetailsActivity
import com.paryavaran.kavalu.utils.LocationHelper
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MapViewActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapViewBinding
    private val viewModel: MapViewModel by viewModels()
    private var googleMap: GoogleMap? = null
    private var allReports = emptyList<Report>()
    private val TAG = "MapViewActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.setNavigationOnClickListener { finish() }

        binding.spinnerFilter.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listOf("All", "Pending", "Cleaned"))
        binding.spinnerFilter.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) = renderMarkers()
            override fun onNothingSelected(parent: AdapterView<*>?) = Unit
        }
        binding.btnRefresh.setOnClickListener { renderMarkers() }

        // My Location button click handler
        binding.btnMyLocation.setOnClickListener {
            lifecycleScope.launch {
                try {
                    Toast.makeText(this@MapViewActivity, "Getting your location...", Toast.LENGTH_SHORT).show()
                    val location = LocationHelper.getCurrentLocation(this@MapViewActivity)
                    if (location != null) {
                        val myLatLng = LatLng(location.latitude, location.longitude)
                        googleMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(myLatLng, 15f))
                        Toast.makeText(this@MapViewActivity, "📍 Here you are!", Toast.LENGTH_SHORT).show()
                        Log.d(TAG, "Navigated to: ${location.latitude}, ${location.longitude}")
                    } else {
                        Toast.makeText(this@MapViewActivity, "Could not get location. Check permissions or GPS.", Toast.LENGTH_SHORT).show()
                        Log.w(TAG, "Location is null")
                    }
                } catch (ex: Exception) {
                    Log.e(TAG, "Error getting location: ${ex.message}", ex)
                    Toast.makeText(this@MapViewActivity, "Error: ${ex.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        Log.d(TAG, "requesting map async")
        Toast.makeText(this, "Initializing map...", Toast.LENGTH_SHORT).show()
        mapFragment.getMapAsync(this)

        viewModel.reports.observe(this) {
            allReports = it
            renderMarkers()
        }
    }

    override fun onMapReady(map: GoogleMap) {
        Log.d(TAG, "onMapReady called")
        Toast.makeText(this, "Map ready ✅", Toast.LENGTH_SHORT).show()
        googleMap = map
        try {
            map.uiSettings.isZoomControlsEnabled = true
            map.uiSettings.isCompassEnabled = true
            map.uiSettings.isMyLocationButtonEnabled = false  // Disable built-in, use our custom FAB
            if (LocationHelper.hasLocationPermission(this)) {
                map.isMyLocationEnabled = true
                Log.d(TAG, "My location enabled")
            } else {
                Log.w(TAG, "Location permission not granted")
            }
        } catch (ex: SecurityException) {
            Log.w(TAG, "Location permission missing: ${ex.message}")
        } catch (ex: Exception) {
            Log.e(TAG, "Error initializing map UI: ${ex.message}", ex)
            Toast.makeText(this, "Map initialization error: ${ex.message}", Toast.LENGTH_LONG).show()
        }
        map.setOnInfoWindowClickListener { marker ->
            (marker.tag as? Long)?.let { reportId ->
                startActivity(Intent(this, ReportDetailsActivity::class.java).putExtra("report_id", reportId))
            }
        }
        
        // Set default camera to Bengaluru
        val bengaluru = LatLng(12.9716, 77.5946)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(bengaluru, 12f))
        
        renderMarkers()
    }

    private fun renderMarkers() {
        val map = googleMap ?: return
        val filter = binding.spinnerFilter.selectedItem?.toString() ?: "All"
        val reports = allReports.filter {
            filter == "All" ||
                (filter == "Pending" && it.status == ReportStatus.PENDING) ||
                (filter == "Cleaned" && it.status == ReportStatus.CLEANED)
        }

        map.clear()
        if (reports.isEmpty()) {
            val bengaluru = LatLng(12.9716, 77.5946)
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(bengaluru, 12f))
            binding.tvMapSummary.text = "No reports yet. Submit a report to place a pin on the map."
            return
        }

        val bounds = LatLngBounds.builder()
        reports.forEach { report ->
            val position = LatLng(report.latitude, report.longitude)
            bounds.include(position)
            val hue = if (report.status == ReportStatus.PENDING) {
                BitmapDescriptorFactory.HUE_RED
            } else {
                BitmapDescriptorFactory.HUE_GREEN
            }
            map.addMarker(
                MarkerOptions()
                    .position(position)
                    .title(report.wasteType)
                    .snippet("${report.status} - ${report.address}")
                    .icon(BitmapDescriptorFactory.defaultMarker(hue))
            )?.tag = report.id
        }

        if (reports.size == 1) {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(reports.first().latitude, reports.first().longitude), 15f))
        } else {
            map.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds.build(), 120))
        }

        val pending = reports.count { it.status == ReportStatus.PENDING }
        val cleaned = reports.count { it.status == ReportStatus.CLEANED }
        binding.tvMapSummary.text = "Showing ${reports.size} reports. Red = $pending pending, Green = $cleaned cleaned. Tap a marker bubble for details."
    }
}
