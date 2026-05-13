package com.paryavaran.kavalu.data.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u000fH\u00c6\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u000fH\u00d6\u0001J\t\u00100\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013\u00a8\u00061"}, d2 = {"Lcom/paryavaran/kavalu/data/database/entities/Report;", "", "id", "", "latitude", "", "longitude", "wasteType", "", "photoPath", "description", "status", "Lcom/paryavaran/kavalu/data/database/entities/ReportStatus;", "timestamp", "ecoKarmaPoints", "", "address", "(JDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paryavaran/kavalu/data/database/entities/ReportStatus;JILjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getDescription", "getEcoKarmaPoints", "()I", "getId", "()J", "getLatitude", "()D", "getLongitude", "getPhotoPath", "getStatus", "()Lcom/paryavaran/kavalu/data/database/entities/ReportStatus;", "getTimestamp", "getWasteType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "reports")
public final class Report {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "latitude")
    private final double latitude = 0.0;
    @androidx.room.ColumnInfo(name = "longitude")
    private final double longitude = 0.0;
    @androidx.room.ColumnInfo(name = "waste_type")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wasteType = null;
    @androidx.room.ColumnInfo(name = "photo_path")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String photoPath = null;
    @androidx.room.ColumnInfo(name = "description")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @androidx.room.ColumnInfo(name = "status")
    @org.jetbrains.annotations.NotNull()
    private final com.paryavaran.kavalu.data.database.entities.ReportStatus status = null;
    @androidx.room.ColumnInfo(name = "timestamp")
    private final long timestamp = 0L;
    @androidx.room.ColumnInfo(name = "eco_karma_points")
    private final int ecoKarmaPoints = 0;
    @androidx.room.ColumnInfo(name = "address")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    
    public Report(long id, double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String wasteType, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.ReportStatus status, long timestamp, int ecoKarmaPoints, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWasteType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.paryavaran.kavalu.data.database.entities.ReportStatus getStatus() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final int getEcoKarmaPoints() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.paryavaran.kavalu.data.database.entities.ReportStatus component7() {
        return null;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.paryavaran.kavalu.data.database.entities.Report copy(long id, double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String wasteType, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.entities.ReportStatus status, long timestamp, int ecoKarmaPoints, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}