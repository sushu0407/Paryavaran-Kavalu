package com.paryavaran.kavalu.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey
    val id: Long = 1,
    @ColumnInfo(name = "total_eco_karma")
    val totalEcoKarma: Int = 0,
    @ColumnInfo(name = "total_reports")
    val totalReports: Int = 0,
    @ColumnInfo(name = "cleaned_reports")
    val cleanedReports: Int = 0,
    @ColumnInfo(name = "pending_reports")
    val pendingReports: Int = 0,
    @ColumnInfo(name = "level")
    val level: Int = 1,
    @ColumnInfo(name = "member_since")
    val memberSince: Long = System.currentTimeMillis()
)
