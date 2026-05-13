package com.paryavaran.kavalu.di;

import android.content.Context;
import androidx.room.Room;
import com.paryavaran.kavalu.data.database.AppDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/paryavaran/kavalu/di/DatabaseModule;", "", "()V", "provideAchievementDao", "Lcom/paryavaran/kavalu/data/database/dao/AchievementDao;", "database", "Lcom/paryavaran/kavalu/data/database/AppDatabase;", "provideDatabase", "context", "Landroid/content/Context;", "provideReportDao", "Lcom/paryavaran/kavalu/data/database/dao/ReportDao;", "provideUserDao", "Lcom/paryavaran/kavalu/data/database/dao/UserDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.paryavaran.kavalu.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.paryavaran.kavalu.data.database.AppDatabase provideDatabase(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.paryavaran.kavalu.data.database.dao.ReportDao provideReportDao(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.AppDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.paryavaran.kavalu.data.database.dao.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.AppDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.paryavaran.kavalu.data.database.dao.AchievementDao provideAchievementDao(@org.jetbrains.annotations.NotNull()
    com.paryavaran.kavalu.data.database.AppDatabase database) {
        return null;
    }
}