package com.paryavaran.kavalu.ui.home;

import androidx.lifecycle.ViewModel;
import com.paryavaran.kavalu.data.repository.ReportRepository;
import com.paryavaran.kavalu.data.repository.UserRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/paryavaran/kavalu/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "reportRepository", "Lcom/paryavaran/kavalu/data/repository/ReportRepository;", "userRepository", "Lcom/paryavaran/kavalu/data/repository/UserRepository;", "(Lcom/paryavaran/kavalu/data/repository/ReportRepository;Lcom/paryavaran/kavalu/data/repository/UserRepository;)V", "reports", "Landroidx/lifecycle/LiveData;", "", "Lcom/paryavaran/kavalu/data/database/entities/Report;", "getReports", "()Landroidx/lifecycle/LiveData;", "user", "Lcom/paryavaran/kavalu/data/database/entities/User;", "getUser", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.repository.ReportRepository reportRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Report>> reports = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.paryavaran.kavalu.data.database.entities.User> user = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.repository.ReportRepository reportRepository, @org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Report>> getReports() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.paryavaran.kavalu.data.database.entities.User> getUser() {
        return null;
    }
}