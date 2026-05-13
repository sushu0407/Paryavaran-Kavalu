package com.paryavaran.kavalu.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.paryavaran.kavalu.data.database.dao.AchievementDao;
import com.paryavaran.kavalu.data.database.dao.ReportDao;
import com.paryavaran.kavalu.data.database.dao.UserDao;
import com.paryavaran.kavalu.data.database.entities.Achievement;
import com.paryavaran.kavalu.data.database.entities.Report;
import com.paryavaran.kavalu.data.database.entities.User;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/paryavaran/kavalu/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "achievementDao", "Lcom/paryavaran/kavalu/data/database/dao/AchievementDao;", "reportDao", "Lcom/paryavaran/kavalu/data/database/dao/ReportDao;", "userDao", "Lcom/paryavaran/kavalu/data/database/dao/UserDao;", "app_debug"})
@androidx.room.Database(entities = {com.paryavaran.kavalu.data.database.entities.Report.class, com.paryavaran.kavalu.data.database.entities.User.class, com.paryavaran.kavalu.data.database.entities.Achievement.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.paryavaran.kavalu.data.database.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.paryavaran.kavalu.data.database.dao.ReportDao reportDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.paryavaran.kavalu.data.database.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.paryavaran.kavalu.data.database.dao.AchievementDao achievementDao();
}