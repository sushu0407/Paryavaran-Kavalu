package com.paryavaran.kavalu.data.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.paryavaran.kavalu.data.database.entities.Achievement;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/paryavaran/kavalu/data/database/dao/AchievementDao;", "", "getAllAchievements", "Landroidx/lifecycle/LiveData;", "", "Lcom/paryavaran/kavalu/data/database/entities/Achievement;", "getUnlockedAchievements", "insertAchievement", "", "achievement", "(Lcom/paryavaran/kavalu/data/database/entities/Achievement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlockAchievement", "achievementId", "", "date", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAchievement", "app_debug"})
@androidx.room.Dao()
public abstract interface AchievementDao {
    
    @androidx.room.Query(value = "SELECT * FROM achievements ORDER BY required_points")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Achievement>> getAllAchievements();
    
    @androidx.room.Query(value = "SELECT * FROM achievements WHERE is_unlocked = 1")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.paryavaran.kavalu.data.database.entities.Achievement>> getUnlockedAchievements();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAchievement(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Achievement achievement, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateAchievement(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.Achievement achievement, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE achievements SET is_unlocked = 1, unlock_date = :date WHERE id = :achievementId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object unlockAchievement(long achievementId, long date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}