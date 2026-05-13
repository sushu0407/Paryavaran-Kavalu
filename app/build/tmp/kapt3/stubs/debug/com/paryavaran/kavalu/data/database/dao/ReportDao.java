package com.paryavaran.kavalu.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.paryavaran.kavalu.data.database.entities.Report;
import com.paryavaran.kavalu.data.database.entities.ReportStatus;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n2\u0006\u0010\r\u001a\u00020\u000eH\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\'J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/paryavaran/kavalu/data/database/dao/ReportDao;", "", "deleteAllReports", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteReport", "report", "Lcom/paryavaran/kavalu/data/database/entities/Report;", "(Lcom/paryavaran/kavalu/data/database/entities/Report;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllReports", "Landroidx/lifecycle/LiveData;", "", "getReportById", "reportId", "", "getReportsByStatus", "status", "Lcom/paryavaran/kavalu/data/database/entities/ReportStatus;", "getReportsCountByStatus", "", "getTotalReportsCount", "insertReport", "updateReport", "updateReportStatus", "(JLcom/paryavaran/kavalu/data/database/entities/ReportStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface ReportDao {
    
    @androidx.room.Query(value = "SELECT * FROM reports ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Report>> getAllReports();
    
    @androidx.room.Query(value = "SELECT * FROM reports WHERE status = :status ORDER BY timestamp DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Report>> getReportsByStatus(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.ReportStatus status);
    
    @androidx.room.Query(value = "SELECT * FROM reports WHERE id = :reportId")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.paryavaran.kavalu.data.database.entities.Report> getReportById(long reportId);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertReport(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateReport(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteReport(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Report report, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE reports SET status = :status WHERE id = :reportId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateReportStatus(long reportId, @org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.ReportStatus status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM reports")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getTotalReportsCount();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM reports WHERE status = :status")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getReportsCountByStatus(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.ReportStatus status);
    
    @androidx.room.Query(value = "DELETE FROM reports")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllReports(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}