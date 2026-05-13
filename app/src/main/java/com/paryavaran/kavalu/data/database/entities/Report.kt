package com.paryavaran.kavalu.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reports")
data class Report(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo(name = "latitude")
    val latitude: Double,
    @ColumnInfo(name = "longitude")
    val longitude: Double,
    @ColumnInfo(name = "waste_type")
    val wasteType: String,
    @ColumnInfo(name = "photo_path")
    val photoPath: String,
    @ColumnInfo(name = "description")
    val description: String = "",
    @ColumnInfo(name = "status")
    val status: ReportStatus = ReportStatus.PENDING,
    @ColumnInfo(name = "timestamp")
    val timestamp: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "eco_karma_points")
    val ecoKarmaPoints: Int = 10,
    @ColumnInfo(name = "address")
    val address: String = ""
)
