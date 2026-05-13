package com.paryavaran.kavalu.ui.myreports

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.databinding.ActivityMyReportsBinding
import com.paryavaran.kavalu.ui.reportdetails.ReportDetailsActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyReportsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyReportsBinding
    private val viewModel: MyReportsViewModel by viewModels()
    private var total = 0
    private var pending = 0
    private var cleaned = 0
    private var allReports = emptyList<Report>()
    private lateinit var adapter: ReportsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyReportsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.setNavigationOnClickListener { finish() }
        adapter = ReportsAdapter { report ->
            startActivity(Intent(this, ReportDetailsActivity::class.java).putExtra("report_id", report.id))
        }
        binding.recyclerReports.layoutManager = LinearLayoutManager(this)
        binding.recyclerReports.adapter = adapter
        binding.spinnerFilter.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listOf("All", "Pending", "Cleaned"))
        binding.spinnerFilter.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: android.view.View?, position: Int, id: Long) = renderReports()
            override fun onNothingSelected(parent: AdapterView<*>?) = Unit
        }
        viewModel.reports.observe(this) {
            allReports = it
            renderReports()
            binding.swipeRefresh.isRefreshing = false
        }
        binding.swipeRefresh.setOnRefreshListener { renderReports(); binding.swipeRefresh.isRefreshing = false }
        viewModel.total.observe(this) { total = it; renderSummary() }
        viewModel.pending.observe(this) { pending = it; renderSummary() }
        viewModel.cleaned.observe(this) { cleaned = it; renderSummary() }
    }

    private fun renderSummary() {
        binding.tvSummary.text = "Total Reports: $total\nCleaned: $cleaned  |  Pending: $pending"
    }

    private fun renderReports() {
        val filter = binding.spinnerFilter.selectedItem?.toString() ?: "All"
        adapter.submitList(
            allReports.filter {
                filter == "All" ||
                    (filter == "Pending" && it.status == ReportStatus.PENDING) ||
                    (filter == "Cleaned" && it.status == ReportStatus.CLEANED)
            }
        )
    }
}
