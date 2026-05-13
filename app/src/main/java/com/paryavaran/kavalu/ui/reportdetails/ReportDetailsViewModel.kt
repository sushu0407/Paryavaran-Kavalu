package com.paryavaran.kavalu.ui.reportdetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.data.repository.ReportRepository
import com.paryavaran.kavalu.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ReportDetailsViewModel @Inject constructor(
    private val reportRepository: ReportRepository,
    private val userRepository: UserRepository
) : ViewModel() {
    fun getReport(reportId: Long) = reportRepository.getReportById(reportId)

    fun markAsCleaned(reportId: Long) = viewModelScope.launch {
        reportRepository.updateReportStatus(reportId, ReportStatus.CLEANED)
        userRepository.ensureUser()
        userRepository.movePendingToCleaned()
        userRepository.addEcoKarmaPoints(20)
    }

    fun delete(report: Report) = viewModelScope.launch { reportRepository.deleteReport(report) }
}
