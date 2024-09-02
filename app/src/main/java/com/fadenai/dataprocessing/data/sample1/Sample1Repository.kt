package com.fadenai.dataprocessing.data.sample1

import com.fadenai.dataprocessing.data.CourseEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class Sample1Repository {

    suspend fun getData(): List<String> = withContext(Dispatchers.IO) {

        delay(1000)

        processData()
    }

    private fun processData(): List<String> {
        return Sample1DataGen.data()
            .asSequence()
            .filter { it.enrollment >= 500 } // Min is 500
            .sortedWith(
                compareByDescending<CourseEntity> { it.enrollment / it.duration }
                    .thenByDescending { it.enrollment }
                    .thenByDescending { it.duration }
            )
            .groupBy { it.category }
            .entries
            .sortedBy { it.key }
            .flatMap { it.value }
            .map {
                "${it.category}: ${it.title} \nEnrollment: ${it.enrollment}," +
                        " Duration: ${it.duration} hours," +
                        " Ratio: ${it.enrollment / it.duration}"
            }.toList()
    }
}