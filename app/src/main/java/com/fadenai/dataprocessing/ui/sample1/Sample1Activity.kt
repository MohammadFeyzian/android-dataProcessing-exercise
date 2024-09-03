package com.fadenai.dataprocessing.ui.sample1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.fadenai.dataprocessing.databinding.Sample1ActivityBinding

class Sample1Activity : AppCompatActivity() {

    private lateinit var binding: Sample1ActivityBinding
    private val viewModel: Sample1ViewModel by viewModels()
    private val sampleAdapter = Sample1Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Sample1ActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)
        initToolbar()
        bindView()
        setupObservers()
        viewModel.requestData()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun bindView() {
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@Sample1Activity)
            adapter = sampleAdapter
            addItemDecoration(
                DividerItemDecoration(
                    this@Sample1Activity,
                    DividerItemDecoration.VERTICAL
                )
            )
        }
    }

    private fun setupObservers() {
        viewModel.viewState.observe(this) { viewState ->

            when (viewState) {
                Sample1ViewState.Loading -> {
                    sampleAdapter.clearData()
                    binding.progressBar.isVisible = true
                }

                is Sample1ViewState.Data -> {
                    binding.progressBar.isVisible = false
                    sampleAdapter.addData(viewState.data)
                }

                Sample1ViewState.Error -> {
                    Toast.makeText(this, "Oops, something went wrong!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}