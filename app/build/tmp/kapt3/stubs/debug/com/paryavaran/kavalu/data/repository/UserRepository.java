package com.paryavaran.kavalu.data.repository;

import com.paryavaran.kavalu.data.database.dao.UserDao;
import com.paryavaran.kavalu.data.database.entities.User;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rJ\u000e\u0010\u000f\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/paryavaran/kavalu/data/repository/UserRepository;", "", "userDao", "Lcom/paryavaran/kavalu/data/database/dao/UserDao;", "(Lcom/paryavaran/kavalu/data/database/dao/UserDao;)V", "addEcoKarmaPoints", "", "points", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "Landroidx/lifecycle/LiveData;", "Lcom/paryavaran/kavalu/data/database/entities/User;", "incrementPendingReports", "incrementTotalReports", "movePendingToCleaned", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.database.dao.UserDao userDao = null;
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.dao.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.paryavaran.kavalu.data.database.entities.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object ensureUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addEcoKarmaPoints(int points, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object incrementTotalReports(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object incrementPendingReports(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object movePendingToCleaned(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}