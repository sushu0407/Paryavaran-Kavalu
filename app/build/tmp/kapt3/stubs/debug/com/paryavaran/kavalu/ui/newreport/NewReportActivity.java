package com.paryavaran.kavalu.ui.newreport;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import com.paryavaran.kavalu.databinding.ActivityNewReportBinding;
import com.paryavaran.kavalu.ui.mapview.MapViewActivity;
import com.paryavaran.kavalu.utils.LocationHelper;
import com.paryavaran.kavalu.utils.PermissionHelper;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.File;
import android.content.Intent;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/paryavaran/kavalu/ui/newreport/NewReportActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/paryavaran/kavalu/databinding/ActivityNewReportBinding;", "cameraUri", "Landroid/net/Uri;", "permissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "takePicture", "viewModel", "Lcom/paryavaran/kavalu/ui/newreport/NewReportViewModel;", "getViewModel", "()Lcom/paryavaran/kavalu/ui/newreport/NewReportViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class NewReportActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.paryavaran.kavalu.databinding.ActivityNewReportBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri cameraUri;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionLauncher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> takePicture = null;
    
    public NewReportActivity() {
        super();
    }
    
    private final com.paryavaran.kavalu.ui.newreport.NewReportViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}