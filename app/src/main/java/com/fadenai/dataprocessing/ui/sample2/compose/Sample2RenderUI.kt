package com.fadenai.dataprocessing.ui.sample2.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.fadenai.dataprocessing.ui.sample2.Sample2ViewState
import kotlinx.coroutines.flow.StateFlow

@Composable
fun Sample2RenderUI(
    viewState: StateFlow<Sample2ViewState>
) {

    val state by viewState.collectAsState()

    when (state) {
        is Sample2ViewState.Data -> Sample2UIContent((state as Sample2ViewState.Data).data)

        Sample2ViewState.Loading -> Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }

        Sample2ViewState.Error -> TODO("Show error logic")
    }
}