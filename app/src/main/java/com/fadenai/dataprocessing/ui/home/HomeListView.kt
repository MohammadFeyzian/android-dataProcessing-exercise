package com.fadenai.dataprocessing.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fadenai.dataprocessing.ui.theme.DataProcessingTheme

@Composable
fun HomeListView(onItemClicked: () -> Unit) {

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(16.dp))

            HomeListBuilder.buildHomeItems()
                .forEach { item ->
                    Button(
                        onClick = { onItemClicked.invoke() },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                    ) {
                        Text(
                            text = item.title
                        )
                    }
                }

            Spacer(modifier = Modifier.height(16.dp))
        }

    }
}

//-------------Preview------------

@Preview(showBackground = true)
@Composable
private fun PreviewHomeListView() {
    DataProcessingTheme {
        HomeListView {}
    }
}