package com.fadenai.dataprocessing.ui.home

import androidx.annotation.StringRes

data class HomeItem(
    @StringRes val title: Int,
    val destination: Class<*>? = null
)