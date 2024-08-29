package com.fadenai.dataprocessing.ui.home

import com.fadenai.dataprocessing.R
import com.fadenai.dataprocessing.ui.sample1.Sample1Activity

object HomeListBuilder {

    fun buildHomeItems(): List<HomeItem> {

        return listOf(
            HomeItem(R.string.sorting_custom_objects, Sample1Activity::class.java),
            HomeItem(R.string.sample_button_title),
            HomeItem(R.string.sample_button_title),
            HomeItem(R.string.sample_button_title),
            HomeItem(R.string.sample_button_title),
        )
    }
}