package com.fadenai.dataprocessing.ui.sample1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fadenai.dataprocessing.databinding.Sample1ItemBinding

class Sample1Adapter : RecyclerView.Adapter<Sample1ViewHolder>() {

    private var data: List<String> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Sample1ViewHolder {
        return Sample1ViewHolder(
            Sample1ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: Sample1ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun addData(data: List<String>) {
        this.data = data
        notifyDataSetChanged()
    }

    fun clearData() {
        data = emptyList()
        notifyDataSetChanged()
    }
}