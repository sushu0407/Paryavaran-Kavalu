package com.paryavaran.kavalu.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.paryavaran.kavalu.data.repository.ReportRepository
import com.paryavaran.kavalu.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val reportRepository: ReportRepository,
    private val userRepository: UserRepository
) : ViewModel() {
    val reports = reportRepository.getAllReports()
    val user = userRepository.getUser()

    init {
        viewModelScope.launch { userRepository.ensureUser() }
    }
}
