package com.paryavaran.kavalu.ui.about

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.paryavaran.kavalu.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.setNavigationOnClickListener { finish() }
    }
}
