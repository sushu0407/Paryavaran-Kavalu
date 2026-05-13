package com.paryavaran.kavalu.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.paryavaran.kavalu.data.database.entities.User

@Dao
interface UserDao {
    @Query("SELECT * FROM users WHERE id = 1")
    fun getUser(): LiveData<User?>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Query("UPDATE users SET total_eco_karma = total_eco_karma + :points WHERE id = 1")
    suspend fun addEcoKarmaPoints(points: Int)

    @Query("UPDATE users SET total_reports = total_reports + 1 WHERE id = 1")
    suspend fun incrementTotalReports()

    @Query("UPDATE users SET cleaned_reports = cleaned_reports + 1 WHERE id = 1")
    suspend fun incrementCleanedReports()

    @Query("UPDATE users SET pending_reports = pending_reports + 1 WHERE id = 1")
    suspend fun incrementPendingReports()

    @Query("UPDATE users SET pending_reports = MAX(pending_reports - 1, 0), cleaned_reports = cleaned_reports + 1 WHERE id = 1")
    suspend fun movePendingToCleaned()
}
