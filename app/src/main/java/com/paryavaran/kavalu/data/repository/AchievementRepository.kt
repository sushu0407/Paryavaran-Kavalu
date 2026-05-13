package com.paryavaran.kavalu.data.repository

import com.paryavaran.kavalu.data.database.dao.AchievementDao
import com.paryavaran.kavalu.data.database.entities.Achievement
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AchievementRepository @Inject constructor(private val achievementDao: AchievementDao) {
    fun getAllAchievements() = achievementDao.getAllAchievements()
    fun getUnlockedAchievements() = achievementDao.getUnlockedAchievements()
    suspend fun insertAchievement(achievement: Achievement) = achievementDao.insertAchievement(achievement)
    suspend fun unlockAchievement(achievementId: Long, date: Long = System.currentTimeMillis()) =
        achievementDao.unlockAchievement(achievementId, date)
}
