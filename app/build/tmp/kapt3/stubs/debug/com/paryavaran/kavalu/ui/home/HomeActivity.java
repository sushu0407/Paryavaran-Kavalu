package com.paryavaran.kavalu.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.paryavaran.kavalu.R;
import com.paryavaran.kavalu.data.database.entities.ReportStatus;
import com.paryavaran.kavalu.databinding.ActivityHomeBinding;
import com.paryavaran.kavalu.ui.about.AboutActivity;
import com.paryavaran.kavalu.ui.mapview.MapViewActivity;
import com.paryavaran.kavalu.ui.myreports.MyReportsActivity;
import com.paryavaran.kavalu.ui.newreport.NewReportActivity;
import com.paryavaran.kavalu.ui.profile.ProfileActivity;
import com.paryavaran.kavalu.ui.reportdetails.ReportDetailsActivity;
import com.paryavaran.kavalu.utils.DateTimeFormatter;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/paryavaran/kavalu/ui/home/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/paryavaran/kavalu/databinding/ActivityHomeBinding;", "viewModel", "Lcom/paryavaran/kavalu/ui/home/HomeViewModel;", "getViewModel", "()Lcom/paryavaran/kavalu/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addRecentCard", "", "text", "", "reportId", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.paryavaran.kavalu.databinding.ActivityHomeBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public HomeActivity() {
        super();
    }
    
    private final com.paryavaran.kavalu.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void addRecentCard(java.lang.String text, java.lang.Long reportId) {
    }
}