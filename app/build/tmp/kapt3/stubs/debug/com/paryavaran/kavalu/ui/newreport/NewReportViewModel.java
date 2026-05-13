package com.paryavaran.kavalu.ui.newreport;

import android.app.Application;
import android.net.Uri;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.paryavaran.kavalu.data.database.entities.Report;
import com.paryavaran.kavalu.data.database.entities.ReportStatus;
import com.paryavaran.kavalu.data.repository.ReportRepository;
import com.paryavaran.kavalu.data.repository.UserRepository;
import com.paryavaran.kavalu.utils.ImageCompressor;
import com.paryavaran.kavalu.utils.LocationHelper;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0013J\u0016\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eR \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/paryavaran/kavalu/ui/newreport/NewReportViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "reportRepository", "Lcom/paryavaran/kavalu/data/repository/ReportRepository;", "userRepository", "Lcom/paryavaran/kavalu/data/repository/UserRepository;", "(Landroid/app/Application;Lcom/paryavaran/kavalu/data/repository/ReportRepository;Lcom/paryavaran/kavalu/data/repository/UserRepository;)V", "_currentLocation", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "_errorMessage", "", "_isLoading", "", "kotlin.jvm.PlatformType", "_photoUri", "Landroid/net/Uri;", "_submitSuccess", "currentLocation", "Landroidx/lifecycle/LiveData;", "getCurrentLocation", "()Landroidx/lifecycle/LiveData;", "errorMessage", "getErrorMessage", "isLoading", "photoUri", "getPhotoUri", "submitSuccess", "getSubmitSuccess", "fetchCurrentLocation", "", "setPhotoUri", "uri", "submitReport", "wasteType", "description", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class NewReportViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.repository.ReportRepository reportRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> _currentLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> currentLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.net.Uri> _photoUri = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.net.Uri> photoUri = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _submitSuccess = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> submitSuccess = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    
    @javax.inject.Inject()
    public NewReportViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.repository.ReportRepository reportRepository, @org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.repository.UserRepository userRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Double, java.lang.Double>> getCurrentLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.net.Uri> getPhotoUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSubmitSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void fetchCurrentLocation() {
    }
    
    public final void setPhotoUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    public final void submitReport(@org.jetbrains.annotations.NotNull()
    java.lang.String wasteType, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
}