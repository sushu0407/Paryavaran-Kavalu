package com.paryavaran.kavalu.ui.myreports

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.databinding.ItemReportBinding
import com.paryavaran.kavalu.utils.DateTimeFormatter

class ReportsAdapter(private val onItemClick: (Report) -> Unit) : ListAdapter<Report, ReportsAdapter.ReportViewHolder>(DiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportViewHolder =
        ReportViewHolder(ItemReportBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ReportViewHolder, position: Int) = holder.bind(getItem(position))

    inner class ReportViewHolder(private val binding: ItemReportBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(report: Report) {
            binding.tvWasteType.text = report.wasteType
            binding.tvLocation.text = report.address
            binding.tvTimestamp.text = DateTimeFormatter.getTimeAgo(report.timestamp)
            binding.tvStatus.text = report.status.name.lowercase().replaceFirstChar { it.uppercase() }
            binding.tvStatus.setTextColor(if (report.status == ReportStatus.PENDING) Color.rgb(211, 47, 47) else Color.rgb(46, 125, 50))
            binding.root.setOnClickListener { onItemClick(report) }
        }
    }

    private object DiffCallback : DiffUtil.ItemCallback<Report>() {
        override fun areItemsTheSame(oldItem: Report, newItem: Report) = oldItem.id == newItem.id
        override fun areContentsTheSame(oldItem: Report, newItem: Report) = oldItem == newItem
    }
}
