package com.paryavaran.kavalu.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.paryavaran.kavalu.data.database.dao.AchievementDao
import com.paryavaran.kavalu.data.database.dao.ReportDao
import com.paryavaran.kavalu.data.database.dao.UserDao
import com.paryavaran.kavalu.data.database.entities.Achievement
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.User

@Database(
    entities = [Report::class, User::class, Achievement::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun reportDao(): ReportDao
    abstract fun userDao(): UserDao
    abstract fun achievementDao(): AchievementDao
}
