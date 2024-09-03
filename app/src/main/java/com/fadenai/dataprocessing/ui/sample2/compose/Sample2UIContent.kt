package com.fadenai.dataprocessing.ui.sample2.compose

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fadenai.dataprocessing.data.CourseEntity
import com.fadenai.dataprocessing.data.sample2.Sample2DataGen
import com.fadenai.dataprocessing.ui.theme.DataProcessingTheme

@Composable
fun Sample2UIContent(
    data: List<CourseEntity>
) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(data) { course ->
            Text(text = course.title)
        }
    }
}

//---------Preview-----------

@Preview(showBackground = true)
@Composable
private fun PreviewSample2UIContent() {
    DataProcessingTheme {
        Sample2UIContent(
            Sample2DataGen.courseList
        )
    }
}