package com.paryavaran.kavalu.ui.myreports;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.paryavaran.kavalu.data.database.entities.Report;
import com.paryavaran.kavalu.data.database.entities.ReportStatus;
import com.paryavaran.kavalu.databinding.ActivityMyReportsBinding;
import com.paryavaran.kavalu.ui.reportdetails.ReportDetailsActivity;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/paryavaran/kavalu/ui/myreports/MyReportsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/paryavaran/kavalu/ui/myreports/ReportsAdapter;", "allReports", "", "Lcom/paryavaran/kavalu/data/database/entities/Report;", "binding", "Lcom/paryavaran/kavalu/databinding/ActivityMyReportsBinding;", "cleaned", "", "pending", "total", "viewModel", "Lcom/paryavaran/kavalu/ui/myreports/MyReportsViewModel;", "getViewModel", "()Lcom/paryavaran/kavalu/ui/myreports/MyReportsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "renderReports", "renderSummary", "app_debug"})
public final class MyReportsActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.paryavaran.kavalu.databinding.ActivityMyReportsBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private int total = 0;
    private int pending = 0;
    private int cleaned = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.paryavaran.kavalu.data.database.entities.Report> allReports;
    private com.paryavaran.kavalu.ui.myreports.ReportsAdapter adapter;
    
    public MyReportsActivity() {
        super();
    }
    
    private final com.paryavaran.kavalu.ui.myreports.MyReportsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void renderSummary() {
    }
    
    private final void renderReports() {
    }
}