package com.paryavaran.kavalu.ui.reportdetails

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.databinding.ActivityReportDetailsBinding
import com.paryavaran.kavalu.ui.mapview.MapViewActivity
import com.paryavaran.kavalu.utils.DateTimeFormatter
import com.paryavaran.kavalu.utils.LocationHelper
import dagger.hilt.android.AndroidEntryPoint
import java.io.File

@AndroidEntryPoint
class ReportDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReportDetailsBinding
    private val viewModel: ReportDetailsViewModel by viewModels()
    private var report: Report? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.setNavigationOnClickListener { finish() }
        val reportId = intent.getLongExtra("report_id", -1)
        viewModel.getReport(reportId).observe(this) { loaded ->
            report = loaded
            loaded?.let { bind(it) }
        }
        binding.btnViewOnMap.setOnClickListener { startActivity(Intent(this, MapViewActivity::class.java)) }
        binding.btnMarkCleaned.setOnClickListener { confirmCleaned(reportId) }
        binding.btnShare.setOnClickListener { shareReport() }
        binding.btnDelete.setOnClickListener { confirmDelete() }
    }

    private fun bind(report: Report) {
        binding.ivPhoto.load(File(report.photoPath))
        val pending = report.status == ReportStatus.PENDING
        binding.tvStatus.text = if (pending) "Status: Pending" else "Status: Cleaned"
        binding.tvStatus.setTextColor(if (pending) Color.rgb(211, 47, 47) else Color.rgb(46, 125, 50))
        binding.tvDetails.text = "Waste Type: ${report.wasteType}\nLocation: ${LocationHelper.formatCoordinates(report.latitude, report.longitude)}\nAddress: ${report.address}\nReported: ${DateTimeFormatter.getTimeAgo(report.timestamp)}\nEco-Karma: +${report.ecoKarmaPoints} points"
        binding.tvDescription.text = "Description\n${report.description.ifBlank { "No description added." }}"
        binding.btnMarkCleaned.isEnabled = pending
    }

    private fun confirmCleaned(reportId: Long) {
        AlertDialog.Builder(this)
            .setTitle("Confirm Cleanup")
            .setMessage("Mark this location as cleaned?")
            .setPositiveButton("Yes") { _, _ ->
                viewModel.markAsCleaned(reportId)
                Toast.makeText(this, "Marked as cleaned. +20 Eco-Karma", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun shareReport() {
        val r = report ?: return
        val uri = Uri.parse("https://maps.google.com/?q=${r.latitude},${r.longitude}")
        startActivity(Intent.createChooser(Intent(Intent.ACTION_SEND).setType("text/plain").putExtra(Intent.EXTRA_TEXT, "${r.wasteType}: $uri"), "Share Location"))
    }

    private fun confirmDelete() {
        val r = report ?: return
        AlertDialog.Builder(this)
            .setTitle("Delete report?")
            .setMessage("This removes the local report from Room.")
            .setPositiveButton("Delete") { _, _ ->
                viewModel.delete(r)
                finish()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }
}
