package com.paryavaran.kavalu.ui.mapview;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.paryavaran.kavalu.R;
import com.paryavaran.kavalu.data.database.entities.Report;
import com.paryavaran.kavalu.data.database.entities.ReportStatus;
import com.paryavaran.kavalu.databinding.ActivityMapViewBinding;
import com.paryavaran.kavalu.ui.reportdetails.ReportDetailsActivity;
import com.paryavaran.kavalu.utils.LocationHelper;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/paryavaran/kavalu/ui/mapview/MapViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "TAG", "", "allReports", "", "Lcom/paryavaran/kavalu/data/database/entities/Report;", "binding", "Lcom/paryavaran/kavalu/databinding/ActivityMapViewBinding;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "viewModel", "Lcom/paryavaran/kavalu/ui/mapview/MapViewModel;", "getViewModel", "()Lcom/paryavaran/kavalu/ui/mapview/MapViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "map", "renderMarkers", "app_debug"})
public final class MapViewActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.paryavaran.kavalu.databinding.ActivityMapViewBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.GoogleMap googleMap;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.paryavaran.kavalu.data.database.entities.Report> allReports;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "MapViewActivity";
    
    public MapViewActivity() {
        super();
    }
    
    private final com.paryavaran.kavalu.ui.mapview.MapViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    private final void renderMarkers() {
    }
}