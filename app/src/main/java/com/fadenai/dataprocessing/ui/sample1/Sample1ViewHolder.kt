package com.fadenai.dataprocessing.ui.sample1

import androidx.recyclerview.widget.RecyclerView
import com.fadenai.dataprocessing.databinding.Sample1ItemBinding

class Sample1ViewHolder(private val binding: Sample1ItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(data: String) {
        binding.textView.text = data
    }
}