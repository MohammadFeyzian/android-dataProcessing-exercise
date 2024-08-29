package com.fadenai.dataprocessing.data.sample1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class Sample1Repository {

    suspend fun getData(): List<String> = withContext(Dispatchers.IO) {

        delay(1000)

        processData()
    }

    private fun processData(): List<String> {
        return rawData().map { item ->
            "${item.title} - Enrollment: ${item.enrollment}, Duration: ${item.duration} hours"
        }
    }


    private fun rawData(): List<Sample1Course> {

        return listOf(
            Sample1Course(
                courseId = 1,
                title = "Kotlin for Android Developers",
                enrollment = 1200,
                duration = 20,
                category = "Android"
            ),
            Sample1Course(
                courseId = 2,
                title = "Advanced Android Architecture",
                enrollment = 800,
                duration = 15,
                category = "Android"
            ),
            Sample1Course(
                courseId = 3,
                title = "Introduction to Machine Learning",
                enrollment = 1500,
                duration = 25,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 4,
                title = "Data Structures in Kotlin",
                enrollment = 1200,
                duration = 10,
                category = "Programming"
            ),
            Sample1Course(
                courseId = 5,
                title = "RxJava for Android",
                enrollment = 800,
                duration = 20,
                category = "Android"
            ),
            Sample1Course(
                courseId = 6,
                title = "Deep Learning with TensorFlow",
                enrollment = 500,
                duration = 30,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 7,
                title = "Algorithms in Kotlin",
                enrollment = 300,
                duration = 25,
                category = "Programming"
            ),
            Sample1Course(
                courseId = 8,
                title = "Neural Networks with PyTorch",
                enrollment = 700,
                duration = 40,
                category = "Data Science"
            ),
        )
    }
}