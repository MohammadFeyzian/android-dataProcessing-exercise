package com.fadenai.dataprocessing.ui.sample2.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fadenai.dataprocessing.R
import com.fadenai.dataprocessing.ui.sample2.Sample2ViewModel
import com.fadenai.dataprocessing.ui.theme.DataProcessingTheme
import com.fadenai.dataprocessing.ui.theme.Purple700

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Sample2UIEntry(
    onBack: () -> Unit,
    viewModel: Sample2ViewModel = viewModel()
) {

    viewModel.getData()

    DataProcessingTheme {

        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = stringResource(R.string.sample_2),
                            color = Color.White
                        )
                    },
                    navigationIcon = {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back button",
                            modifier = Modifier
                                .padding(16.dp)
                                .clickable(onClick = onBack),
                            tint = Color.White
                        )
                    },
                    colors = TopAppBarDefaults.topAppBarColors().copy(containerColor = Purple700)
                )
            }
        ) { contentPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(contentPadding)
            ) {
                Sample2RenderUI(
                    viewModel.viewState
                )
            }
        }
    }
}