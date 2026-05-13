package com.paryavaran.kavalu.ui.profile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation
import com.paryavaran.kavalu.R
import com.paryavaran.kavalu.data.database.entities.ReportStatus
import com.paryavaran.kavalu.databinding.ActivityProfileBinding
import com.paryavaran.kavalu.ui.reportdetails.ReportDetailsActivity
import com.paryavaran.kavalu.ui.settings.SettingsActivity
import com.paryavaran.kavalu.utils.DateTimeFormatter
import com.paryavaran.kavalu.utils.EcoKarmaCalculator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    private val viewModel: ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.setNavigationOnClickListener { finish() }
        binding.btnSettings.setOnClickListener { startActivity(Intent(this, SettingsActivity::class.java)) }
        loadProfile()

        viewModel.user.observe(this) { user ->
            val points = user?.totalEcoKarma ?: 0
            val level = EcoKarmaCalculator.calculateLevel(points)
            binding.tvKarma.text = "$points Eco-Karma Points\nLevel $level: ${EcoKarmaCalculator.getLevelName(level)}"
            binding.progressLevel.progress = EcoKarmaCalculator.progressToNextLevel(points)
            binding.tvStats.text = "Statistics\nTotal Reports: ${user?.totalReports ?: 0}\nCleaned: ${user?.cleanedReports ?: 0}\nPending: ${user?.pendingReports ?: 0}\nMember Since: ${DateTimeFormatter.monthYear(user?.memberSince ?: System.currentTimeMillis())}\n\nAchievements\nFirst Report - Clean Captain - Green Guardian"
        }

        viewModel.reports.observe(this) { reports ->
            binding.recentReportsContainer.removeAllViews()
            if (reports.isEmpty()) {
                addRecentCard("No recent reports yet.\nCreate a report and it will appear here.", null)
            } else {
                reports.take(4).forEach { report ->
                    val status = if (report.status == ReportStatus.PENDING) "Pending" else "Cleaned"
                    addRecentCard("$status - ${report.wasteType}\n${report.address}\n${DateTimeFormatter.getTimeAgo(report.timestamp)}", report.id)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (::binding.isInitialized) loadProfile()
    }

    private fun loadProfile() {
        val prefs = getSharedPreferences("profile", MODE_PRIVATE)
        binding.tvProfileName.text = prefs.getString("name", "Environmental Warrior")
        prefs.getString("photo", null)?.let {
            binding.ivAvatar.load(Uri.parse(it)) {
                transformations(CircleCropTransformation())
            }
        }
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
                    startActivity(Intent(this@ProfileActivity, ReportDetailsActivity::class.java).putExtra("report_id", reportId))
                }
            }
        }
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        params.setMargins(0, 0, 0, 10)
        binding.recentReportsContainer.addView(card, params)
    }
}
