package com.paryavaran.kavalu.ui.reportdetails;

import androidx.lifecycle.ViewModel;
import com.paryavaran.kavalu.data.database.entities.Report;
import com.paryavaran.kavalu.data.database.entities.ReportStatus;
import com.paryavaran.kavalu.data.repository.ReportRepository;
import com.paryavaran.kavalu.data.repository.UserRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/paryavaran/kavalu/ui/reportdetails/ReportDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "reportRepository", "Lcom/paryavaran/kavalu/data/repository/ReportRepository;", "userRepository", "Lcom/paryavaran/kavalu/data/repository/UserRepository;", "(Lcom/paryavaran/kavalu/data/repository/ReportRepository;Lcom/paryavaran/kavalu/data/repository/UserRepository;)V", "delete", "Lkotlinx/coroutines/Job;", "report", "Lcom/paryavaran/kavalu/data/database/entities/Report;", "getReport", "Landroidx/lifecycle/LiveData;", "reportId", "", "markAsCleaned", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ReportDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.repository.ReportRepository reportRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.repository.UserRepository userRepository = null;
    
    @javax.inject.Inject()
    public ReportDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.repository.ReportRepository reportRepository, @org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.paryavaran.kavalu.data.database.entities.Report> getReport(long reportId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job markAsCleaned(long reportId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Report report) {
        return null;
    }
}