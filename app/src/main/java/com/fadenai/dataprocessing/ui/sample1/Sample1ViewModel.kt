package com.fadenai.dataprocessing.ui.sample1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fadenai.dataprocessing.data.sample1.Sample1Repository
import kotlinx.coroutines.launch

class Sample1ViewModel : ViewModel() {

    private val repository = Sample1Repository()

    private val _viewState = MutableLiveData<Sample1ViewState>()
    val viewState: LiveData<Sample1ViewState> = _viewState

    fun requestData() {

        viewModelScope.launch {
            _viewState.value = Sample1ViewState.Loading

            _viewState.value = Sample1ViewState.Data(data = repository.getData())
        }
    }

}