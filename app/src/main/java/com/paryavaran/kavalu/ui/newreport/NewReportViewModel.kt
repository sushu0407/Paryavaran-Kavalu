package com.paryavaran.kavalu.ui.newreport

import android.app.Application
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.data.repository.ReportRepository
import com.paryavaran.kavalu.data.repository.UserRepository
import com.paryavaran.kavalu.utils.ImageCompressor
import com.paryavaran.kavalu.utils.LocationHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewReportViewModel @Inject constructor(
    application: Application,
    private val reportRepository: ReportRepository,
    private val userRepository: UserRepository
) : AndroidViewModel(application) {
    private val _currentLocation = MutableLiveData<Pair<Double, Double>>()
    val currentLocation: LiveData<Pair<Double, Double>> = _currentLocation
    private val _photoUri = MutableLiveData<Uri?>()
    val photoUri: LiveData<Uri?> = _photoUri
    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> = _isLoading
    private val _submitSuccess = MutableLiveData(false)
    val submitSuccess: LiveData<Boolean> = _submitSuccess
    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> = _errorMessage

    fun fetchCurrentLocation() {
        viewModelScope.launch {
            _isLoading.value = true
            _errorMessage.value = "Getting location..."
            val location = LocationHelper.getCurrentLocation(getApplication())
            if (location == null) _errorMessage.value = "Location permission is required"
            else _currentLocation.value = location.latitude to location.longitude
            _isLoading.value = false
        }
    }

    fun setPhotoUri(uri: Uri?) {
        _photoUri.value = uri
    }

    fun submitReport(wasteType: String, description: String) {
        viewModelScope.launch {
            val location = _currentLocation.value
            val uri = _photoUri.value
            when {
                location == null -> _errorMessage.value = "Capture location first"
                uri == null -> _errorMessage.value = "Capture a photo first"
                wasteType.isBlank() || wasteType == "Select waste type" -> _errorMessage.value = "Select waste type"
                else -> {
                    _isLoading.value = true
                    val file = ImageCompressor.compressImage(getApplication(), uri)
                    if (file == null) {
                        _errorMessage.value = "Failed to process photo"
                    } else {
                        val address = LocationHelper.getAddressFromLocation(getApplication(), location.first, location.second)
                        reportRepository.insertReport(
                            Report(
                                latitude = location.first,
                                longitude = location.second,
                                wasteType = wasteType,
                                photoPath = file.absolutePath,
                                description = description,
                                status = ReportStatus.PENDING,
                                address = address
                            )
                        )
                        userRepository.ensureUser()
                        userRepository.incrementTotalReports()
                        userRepository.incrementPendingReports()
                        userRepository.addEcoKarmaPoints(10)
                        _submitSuccess.value = true
                    }
                    _isLoading.value = false
                }
            }
        }
    }
}
