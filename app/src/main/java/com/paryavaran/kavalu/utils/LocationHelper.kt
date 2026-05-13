package com.paryavaran.kavalu.utils

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.location.Location
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withTimeoutOrNull
import timber.log.Timber
import java.util.Locale
import kotlin.coroutines.resume

object LocationHelper {
    suspend fun getCurrentLocation(context: Context): Location? {
        if (!hasLocationPermission(context)) return null
        val client = LocationServices.getFusedLocationProviderClient(context)

        val cached = getLastKnownLocation(client)
        if (cached != null && System.currentTimeMillis() - cached.time < 10 * 60 * 1000) {
            return cached
        }

        return withTimeoutOrNull(4500) {
            getFreshLocation(client, Priority.PRIORITY_BALANCED_POWER_ACCURACY)
        } ?: cached
    }

    private suspend fun getLastKnownLocation(client: FusedLocationProviderClient): Location? =
        suspendCancellableCoroutine { continuation ->
            try {
                client.lastLocation
                    .addOnSuccessListener { continuation.resume(it) }
                    .addOnFailureListener {
                        Timber.e(it, "Last location lookup failed")
                        continuation.resume(null)
                    }
            } catch (e: SecurityException) {
                Timber.e(e)
                continuation.resume(null)
            }
        }

    private suspend fun getFreshLocation(client: FusedLocationProviderClient, priority: Int): Location? =
        suspendCancellableCoroutine { continuation ->
            val tokenSource = CancellationTokenSource()
            try {
                client.getCurrentLocation(priority, tokenSource.token)
                    .addOnSuccessListener { continuation.resume(it) }
                    .addOnFailureListener {
                        Timber.e(it, "Fresh location lookup failed")
                        continuation.resume(null)
                    }
            } catch (e: SecurityException) {
                Timber.e(e)
                continuation.resume(null)
            }
            continuation.invokeOnCancellation { tokenSource.cancel() }
        }

    fun hasLocationPermission(context: Context): Boolean =
        ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED ||
            ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED

    @Suppress("DEPRECATION")
    fun getAddressFromLocation(context: Context, latitude: Double, longitude: Double): String = try {
        val geocoder = Geocoder(context, Locale.getDefault())
        val addresses: List<Address>? = geocoder.getFromLocation(latitude, longitude, 1)
        addresses?.firstOrNull()?.let { address ->
            address.getAddressLine(0)
                ?: listOfNotNull(address.subLocality, address.locality).joinToString(", ")
        }.takeUnless { it.isNullOrBlank() } ?: formatCoordinates(latitude, longitude)
    } catch (e: Exception) {
        Timber.e(e, "Reverse geocode failed")
        formatCoordinates(latitude, longitude)
    }

    fun formatCoordinates(latitude: Double, longitude: Double): String {
        val latDirection = if (latitude >= 0) "N" else "S"
        val lonDirection = if (longitude >= 0) "E" else "W"
        return "%.4f deg %s, %.4f deg %s".format(
            kotlin.math.abs(latitude),
            latDirection,
            kotlin.math.abs(longitude),
            lonDirection
        )
    }
}
