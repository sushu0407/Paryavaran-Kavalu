package com.paryavaran.kavalu.data.repository

import com.paryavaran.kavalu.data.database.dao.UserDao
import com.paryavaran.kavalu.data.database.entities.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val userDao: UserDao) {
    fun getUser() = userDao.getUser()
    suspend fun ensureUser() = userDao.insertUser(User())
    suspend fun addEcoKarmaPoints(points: Int) = userDao.addEcoKarmaPoints(points)
    suspend fun incrementTotalReports() = userDao.incrementTotalReports()
    suspend fun incrementPendingReports() = userDao.incrementPendingReports()
    suspend fun movePendingToCleaned() = userDao.movePendingToCleaned()
}
