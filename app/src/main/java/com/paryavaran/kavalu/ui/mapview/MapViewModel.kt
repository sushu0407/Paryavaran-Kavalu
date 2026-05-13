package com.paryavaran.kavalu.ui.mapview

import androidx.lifecycle.ViewModel
import com.paryavaran.kavalu.data.repository.ReportRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(private val reportRepository: ReportRepository) : ViewModel() {
    val reports = reportRepository.getAllReports()
}
