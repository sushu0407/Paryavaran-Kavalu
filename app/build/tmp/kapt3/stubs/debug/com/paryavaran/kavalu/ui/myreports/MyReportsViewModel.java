package com.paryavaran.kavalu.ui.myreports;

import androidx.lifecycle.ViewModel;
import com.paryavaran.kavalu.data.database.entities.ReportStatus;
import com.paryavaran.kavalu.data.repository.ReportRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/paryavaran/kavalu/ui/myreports/MyReportsViewModel;", "Landroidx/lifecycle/ViewModel;", "reportRepository", "Lcom/paryavaran/kavalu/data/repository/ReportRepository;", "(Lcom/paryavaran/kavalu/data/repository/ReportRepository;)V", "cleaned", "Landroidx/lifecycle/LiveData;", "", "getCleaned", "()Landroidx/lifecycle/LiveData;", "pending", "getPending", "reports", "", "Lcom/paryavaran/kavalu/data/database/entities/Report;", "getReports", "total", "getTotal", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MyReportsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.repository.ReportRepository reportRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Report>> reports = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> total = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> pending = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> cleaned = null;
    
    @javax.inject.Inject()
    public MyReportsViewModel(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.repository.ReportRepository reportRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Report>> getReports() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getPending() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCleaned() {
        return null;
    }
}