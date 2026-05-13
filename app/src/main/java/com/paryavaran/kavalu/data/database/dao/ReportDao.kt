package com.paryavaran.kavalu.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.ReportStatus

@Dao
interface ReportDao {
    @Query("SELECT * FROM reports ORDER BY timestamp DESC")
    fun getAllReports(): LiveData<List<Report>>

    @Query("SELECT * FROM reports WHERE status = :status ORDER BY timestamp DESC")
    fun getReportsByStatus(status: ReportStatus): LiveData<List<Report>>

    @Query("SELECT * FROM reports WHERE id = :reportId")
    fun getReportById(reportId: Long): LiveData<Report?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReport(report: Report): Long

    @Update
    suspend fun updateReport(report: Report)

    @Delete
    suspend fun deleteReport(report: Report)

    @Query("UPDATE reports SET status = :status WHERE id = :reportId")
    suspend fun updateReportStatus(reportId: Long, status: ReportStatus)

    @Query("SELECT COUNT(*) FROM reports")
    fun getTotalReportsCount(): LiveData<Int>

    @Query("SELECT COUNT(*) FROM reports WHERE status = :status")
    fun getReportsCountByStatus(status: ReportStatus): LiveData<Int>

    @Query("DELETE FROM reports")
    suspend fun deleteAllReports()
}
