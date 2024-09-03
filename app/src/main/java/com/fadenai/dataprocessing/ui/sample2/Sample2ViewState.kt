package com.fadenai.dataprocessing.ui.sample2

import com.fadenai.dataprocessing.data.CourseEntity

sealed interface Sample2ViewState {

    data object Loading : Sample2ViewState

    data object Error : Sample2ViewState

    data class Data(
        val data: List<CourseEntity>
    ) : Sample2ViewState
}