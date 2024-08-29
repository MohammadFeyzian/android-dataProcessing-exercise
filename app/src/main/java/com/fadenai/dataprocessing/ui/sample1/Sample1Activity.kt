package com.fadenai.dataprocessing.ui.sample1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fadenai.dataprocessing.databinding.Sample1ActivityBinding

class Sample1Activity : AppCompatActivity() {

    private lateinit var binding: Sample1ActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Sample1ActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)
        initToolbar()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun bindView() {

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}