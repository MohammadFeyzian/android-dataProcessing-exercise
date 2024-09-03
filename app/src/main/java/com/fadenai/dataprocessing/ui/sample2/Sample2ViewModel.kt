package com.fadenai.dataprocessing.ui.sample2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fadenai.dataprocessing.data.sample2.Sample2Repository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class Sample2ViewModel(
    private val repository: Sample2Repository = Sample2Repository()
) : ViewModel() {

    private val _viewState = MutableStateFlow<Sample2ViewState>(Sample2ViewState.Loading)
    val viewState: StateFlow<Sample2ViewState> = _viewState

    init {
        getData()
    }

    fun getData() {

        viewModelScope.launch {
            _viewState.value = Sample2ViewState.Loading

            try {
                _viewState.value = Sample2ViewState.Data(data = repository.getData())
            } catch (e: Exception) {
                e.printStackTrace()
                _viewState.value = Sample2ViewState.Error
            }
        }
    }
}