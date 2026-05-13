package com.paryavaran.kavalu.ui.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.paryavaran.kavalu.data.repository.ReportRepository
import com.paryavaran.kavalu.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val userRepository: UserRepository,
    reportRepository: ReportRepository
) : ViewModel() {
    val user = userRepository.getUser()
    val reports = reportRepository.getAllReports()

    init {
        viewModelScope.launch { userRepository.ensureUser() }
    }
}
