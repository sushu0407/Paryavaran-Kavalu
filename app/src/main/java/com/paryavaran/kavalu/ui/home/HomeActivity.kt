package com.paryavaran.kavalu.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.paryavaran.kavalu.R
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.databinding.ActivityHomeBinding
import com.paryavaran.kavalu.ui.about.AboutActivity
import com.paryavaran.kavalu.ui.mapview.MapViewActivity
import com.paryavaran.kavalu.ui.myreports.MyReportsActivity
import com.paryavaran.kavalu.ui.newreport.NewReportActivity
import com.paryavaran.kavalu.ui.profile.ProfileActivity
import com.paryavaran.kavalu.ui.reportdetails.ReportDetailsActivity
import com.paryavaran.kavalu.utils.DateTimeFormatter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.btnNewReport.setOnClickListener { startActivity(Intent(this, NewReportActivity::class.java)) }
        binding.btnMapView.setOnClickListener { startActivity(Intent(this, MapViewActivity::class.java)) }
        binding.btnMyReports.setOnClickListener { startActivity(Intent(this, MyReportsActivity::class.java)) }
        binding.btnAbout.setOnClickListener { startActivity(Intent(this, AboutActivity::class.java)) }

        viewModel.user.observe(this) { user ->
            binding.tvEcoKarma.text = "${user?.totalEcoKarma ?: 0} Eco-Karma Points"
            val total = user?.totalReports ?: 0
            val pending = user?.pendingReports ?: 0
            binding.tvHeroSubtext.text = "$total reports submitted. $pending locations still need cleanup."
        }
        viewModel.reports.observe(this) { reports ->
            binding.recentReportsContainer.removeAllViews()
            if (reports.isEmpty()) {
                addRecentCard("No recent reports yet.\nStart with New Report to place your first cleanup pin.", null)
            } else {
                reports.take(5).forEach { report ->
                    val status = if (report.status == ReportStatus.PENDING) "Pending" else "Cleaned"
                    addRecentCard("$status - ${report.wasteType}\n${report.address}\n${DateTimeFormatter.getTimeAgo(report.timestamp)}", report.id)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val name = getSharedPreferences("profile", MODE_PRIVATE).getString("name", "Environmental Warrior")
        binding.tvGreeting.text = "Good day, $name"
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add("Profile").setIcon(android.R.drawable.ic_menu_myplaces).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        startActivity(Intent(this, ProfileActivity::class.java))
        return true
    }

    private fun addRecentCard(text: String, reportId: Long?) {
        val card = TextView(this).apply {
            setBackgroundResource(R.drawable.bg_soft_card)
            setPadding(18, 16, 18, 16)
            setTextColor(getColor(R.color.gray_dark))
            textSize = 15f
            this.text = text
            if (reportId != null) {
                setOnClickListener {
                    startActivity(Intent(this@HomeActivity, ReportDetailsActivity::class.java).putExtra("report_id", reportId))
                }
            }
        }
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        params.setMargins(0, 0, 0, 10)
        binding.recentReportsContainer.addView(card, params)
    }
}
