package com.paryavaran.kavalu.data.repository

import com.paryavaran.kavalu.data.database.dao.ReportDao
import com.paryavaran.kavalu.data.database.entities.Report
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ReportRepository @Inject constructor(private val reportDao: ReportDao) {
    fun getAllReports() = reportDao.getAllReports()
    fun getReportsByStatus(status: ReportStatus) = reportDao.getReportsByStatus(status)
    fun getReportById(reportId: Long) = reportDao.getReportById(reportId)
    fun getTotalReportsCount() = reportDao.getTotalReportsCount()
    fun getReportsCountByStatus(status: ReportStatus) = reportDao.getReportsCountByStatus(status)
    suspend fun insertReport(report: Report) = reportDao.insertReport(report)
    suspend fun updateReport(report: Report) = reportDao.updateReport(report)
    suspend fun deleteReport(report: Report) = reportDao.deleteReport(report)
    suspend fun updateReportStatus(reportId: Long, status: ReportStatus) = reportDao.updateReportStatus(reportId, status)
    suspend fun deleteAllReports() = reportDao.deleteAllReports()
}
