package com.paryavaran.kavalu.data.repository;

import com.paryavaran.kavalu.data.database.dao.AchievementDao;
import com.paryavaran.kavalu.data.database.entities.Achievement;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/paryavaran/kavalu/data/repository/AchievementRepository;", "", "achievementDao", "Lcom/paryavaran/kavalu/data/database/dao/AchievementDao;", "(Lcom/paryavaran/kavalu/data/database/dao/AchievementDao;)V", "getAllAchievements", "Landroidx/lifecycle/LiveData;", "", "Lcom/paryavaran/kavalu/data/database/entities/Achievement;", "getUnlockedAchievements", "insertAchievement", "", "achievement", "(Lcom/paryavaran/kavalu/data/database/entities/Achievement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlockAchievement", "achievementId", "", "date", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AchievementRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.database.dao.AchievementDao achievementDao = null;
    
    @javax.inject.Inject()
    public AchievementRepository(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.dao.AchievementDao achievementDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Achievement>> getAllAchievements() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Achievement>> getUnlockedAchievements() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertAchievement(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Achievement achievement, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object unlockAchievement(long achievementId, long date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}