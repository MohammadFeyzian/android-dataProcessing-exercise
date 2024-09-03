package com.fadenai.dataprocessing.data.sample2

import com.fadenai.dataprocessing.data.CourseEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.math.abs

class Sample2Repository {

    suspend fun getData(): List<CourseEntity> = withContext(Dispatchers.IO) {
        delay(1000) // Simulate the long processing
        processData()
    }

    private fun processData(): List<CourseEntity> {

        // Step 1 & 2: Filter and sort
        val list = Sample2DataGen.courseList
            .filter { it.enrollment >= 1000 }
            .sortedWith(
                compareByDescending<CourseEntity> { it.enrollment }
                    .thenBy { it.duration }
            )

        // Step 3: Find the average & Closest course to the average
        val averageRating = list.map { it.rating }.average()
        list.minByOrNull { abs(it.rating - averageRating) }
            ?.isTopCourse = true

        return list
    }
}

fun main() = runBlocking {

    println("Start processing...\n\n")
    val repo = Sample2Repository()

    repo.getData().forEach {
        println(
            "${it.title}\n${it.enrollment} enrollments," +
                    " ${it.duration} hours ${if (it.isTopCourse) "\nTop course" else ""}"
        )
        println("---------------------")
    }

    println("\n\nEnd processing.")
}