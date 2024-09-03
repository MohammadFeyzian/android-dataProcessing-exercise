package com.fadenai.dataprocessing.ui.sample1

sealed interface Sample1ViewState {

    data object Loading : Sample1ViewState

    data object Error : Sample1ViewState

    data class Data(
        val data: List<String>
    ) : Sample1ViewState
}