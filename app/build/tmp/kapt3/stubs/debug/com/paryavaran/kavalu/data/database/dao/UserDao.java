package com.paryavaran.kavalu.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.paryavaran.kavalu.data.database.entities.User;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\'J\u000e\u0010\n\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/paryavaran/kavalu/data/database/dao/UserDao;", "", "addEcoKarmaPoints", "", "points", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Landroidx/lifecycle/LiveData;", "Lcom/paryavaran/kavalu/data/database/entities/User;", "incrementCleanedReports", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementPendingReports", "incrementTotalReports", "insertUser", "user", "(Lcom/paryavaran/kavalu/data/database/entities/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "movePendingToCleaned", "updateUser", "app_debug"})
@androidx.room.Dao()
public abstract interface UserDao {
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE id = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.paryavaran.kavalu.data.database.entities.User> getUser();
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertUser(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET total_eco_karma = total_eco_karma + :points WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addEcoKarmaPoints(int points, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET total_reports = total_reports + 1 WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object incrementTotalReports(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET cleaned_reports = cleaned_reports + 1 WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object incrementCleanedReports(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET pending_reports = pending_reports + 1 WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object incrementPendingReports(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET pending_reports = MAX(pending_reports - 1, 0), cleaned_reports = cleaned_reports + 1 WHERE id = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object movePendingToCleaned(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}