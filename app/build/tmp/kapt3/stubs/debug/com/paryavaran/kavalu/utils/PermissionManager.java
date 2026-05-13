package com.paryavaran.kavalu.utils;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0012\u001a\u00020\u0013J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J5\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR+\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/paryavaran/kavalu/utils/PermissionManager;", "", "()V", "PERMISSION_REQUEST_CODE", "", "REQUIRED_PERMISSIONS", "", "", "[Ljava/lang/String;", "permissionCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "allGranted", "", "getPermissionsToRequest", "", "context", "Landroid/content/Context;", "handlePermissionResult", "grantResults", "", "permissions", "([I[Ljava/lang/String;)V", "hasAllPermissions", "requestPermissions", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "callback", "app_debug"})
public final class PermissionManager {
    public static final int PERMISSION_REQUEST_CODE = 1001;
    @org.jetbrains.annotations.Nullable()
    private static kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> permissionCallback;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] REQUIRED_PERMISSIONS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.paryavaran.kavalu.utils.PermissionManager INSTANCE = null;
    
    private PermissionManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPermissionsToRequest(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean hasAllPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void requestPermissions(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public final void handlePermissionResult(@org.jetbrains.annotations.NotNull()
    int[] grantResults, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
    }
}