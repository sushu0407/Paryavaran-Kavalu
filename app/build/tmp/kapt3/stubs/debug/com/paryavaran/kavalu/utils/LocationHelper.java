package com.paryavaran.kavalu.utils;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.Priority;
import com.google.android.gms.tasks.CancellationTokenSource;
import timber.log.Timber;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u0018"}, d2 = {"Lcom/paryavaran/kavalu/utils/LocationHelper;", "", "()V", "formatCoordinates", "", "latitude", "", "longitude", "getAddressFromLocation", "context", "Landroid/content/Context;", "getCurrentLocation", "Landroid/location/Location;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFreshLocation", "client", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "priority", "", "(Lcom/google/android/gms/location/FusedLocationProviderClient;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastKnownLocation", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasLocationPermission", "", "app_debug"})
public final class LocationHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.paryavaran.kavalu.utils.LocationHelper INSTANCE = null;
    
    private LocationHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.location.Location> $completion) {
        return null;
    }
    
    private final java.lang.Object getLastKnownLocation(com.google.android.gms.location.FusedLocationProviderClient client, kotlin.coroutines.Continuation<? super android.location.Location> $completion) {
        return null;
    }
    
    private final java.lang.Object getFreshLocation(com.google.android.gms.location.FusedLocationProviderClient client, int priority, kotlin.coroutines.Continuation<? super android.location.Location> $completion) {
        return null;
    }
    
    public final boolean hasLocationPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressFromLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, double latitude, double longitude) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatCoordinates(double latitude, double longitude) {
        return null;
    }
}