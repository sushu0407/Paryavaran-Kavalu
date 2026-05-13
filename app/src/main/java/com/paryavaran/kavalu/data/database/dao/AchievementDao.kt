package com.paryavaran.kavalu.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.paryavaran.kavalu.data.database.entities.Achievement

@Dao
interface AchievementDao {
    @Query("SELECT * FROM achievements ORDER BY required_points")
    fun getAllAchievements(): LiveData<List<Achievement>>

    @Query("SELECT * FROM achievements WHERE is_unlocked = 1")
    fun getUnlockedAchievements(): LiveData<List<Achievement>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAchievement(achievement: Achievement)

    @Update
    suspend fun updateAchievement(achievement: Achievement)

    @Query("UPDATE achievements SET is_unlocked = 1, unlock_date = :date WHERE id = :achievementId")
    suspend fun unlockAchievement(achievementId: Long, date: Long)
}
