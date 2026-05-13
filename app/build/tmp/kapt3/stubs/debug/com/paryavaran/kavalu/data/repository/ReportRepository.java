package com.paryavaran.kavalu.data.repository;

import com.paryavaran.kavalu.data.database.dao.ReportDao;
import com.paryavaran.kavalu.data.database.entities.Report;
import com.paryavaran.kavalu.data.database.entities.ReportStatus;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rJ\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/paryavaran/kavalu/data/repository/ReportRepository;", "", "reportDao", "Lcom/paryavaran/kavalu/data/database/dao/ReportDao;", "(Lcom/paryavaran/kavalu/data/database/dao/ReportDao;)V", "deleteAllReports", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteReport", "report", "Lcom/paryavaran/kavalu/data/database/entities/Report;", "(Lcom/paryavaran/kavalu/data/database/entities/Report;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllReports", "Landroidx/lifecycle/LiveData;", "", "getReportById", "reportId", "", "getReportsByStatus", "status", "Lcom/paryavaran/kavalu/data/database/entities/ReportStatus;", "getReportsCountByStatus", "", "getTotalReportsCount", "insertReport", "updateReport", "updateReportStatus", "(JLcom/paryavaran/kavalu/data/database/entities/ReportStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ReportRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.database.dao.ReportDao reportDao = null;
    
    @javax.inject.Inject()
    public ReportRepository(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.dao.ReportDao reportDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Report>> getAllReports() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Report>> getReportsByStatus(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.ReportStatus status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.paryavaran.kavalu.data.database.entities.Report> getReportById(long reportId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotalReportsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getReportsCountByStatus(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.ReportStatus status) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertReport(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateReport(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteReport(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateReportStatus(long reportId, @org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.ReportStatus status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllReports(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}