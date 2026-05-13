package com.paryavaran.kavalu.ui.myreports

import androidx.lifecycle.ViewModel
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.data.repository.ReportRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyReportsViewModel @Inject constructor(private val reportRepository: ReportRepository) : ViewModel() {
    val reports = reportRepository.getAllReports()
    val total = reportRepository.getTotalReportsCount()
    val pending = reportRepository.getReportsCountByStatus(ReportStatus.PENDING)
    val cleaned = reportRepository.getReportsCountByStatus(ReportStatus.CLEANED)
}
