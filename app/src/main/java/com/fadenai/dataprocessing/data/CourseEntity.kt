package com.fadenai.dataprocessing.data

data class CourseEntity(
    val courseId: Int,
    val title: String,
    val enrollment: Int,
    val duration: Int,
    val category: String,
    val rating: Double = -1.0,
    val students: List<StudentEntity> = emptyList(),
    var isTopCourse: Boolean = false
)