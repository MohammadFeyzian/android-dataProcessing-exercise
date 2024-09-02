package com.fadenai.dataprocessing.data.sample2

import com.fadenai.dataprocessing.data.CourseEntity
import com.fadenai.dataprocessing.data.StudentEntity

object Sample2DataGen {

    private val studentsList1 = listOf(
        StudentEntity(1, "Alice Smith", "alice.smith@example.com"),
        StudentEntity(2, "Bob Johnson", "bob.johnson@example.com"),
        StudentEntity(3, "Charlie Brown", "charlie.brown@example.com")
    )

    private val studentsList2 = listOf(
        StudentEntity(4, "David Wilson", "david.wilson@example.com"),
        StudentEntity(5, "Eve Davis", "eve.davis@example.com"),
        StudentEntity(6, "Frank Harris", "frank.harris@example.com")
    )

    private val studentsList3 = listOf(
        StudentEntity(7, "Grace Lee", "grace.lee@example.com"),
        StudentEntity(8, "Henry Martin", "henry.martin@example.com"),
        StudentEntity(9, "Isabella Clark", "isabella.clark@example.com")
    )

    private val studentsList4 = listOf(
        StudentEntity(10, "Jack Lewis", "jack.lewis@example.com"),
        StudentEntity(11, "Karen Young", "karen.young@example.com"),
        StudentEntity(12, "Leo King", "leo.king@example.com")
    )

    private val studentsList5 = listOf(
        StudentEntity(13, "Mia Scott", "mia.scott@example.com"),
        StudentEntity(14, "Noah Allen", "noah.allen@example.com"),
        StudentEntity(15, "Olivia Wright", "olivia.wright@example.com")
    )

    private val studentsList6 = listOf(
        StudentEntity(16, "Paul Walker", "paul.walker@example.com"),
        StudentEntity(17, "Quinn Stewart", "quinn.stewart@example.com"),
        StudentEntity(18, "Rachel Adams", "rachel.adams@example.com")
    )

    private val studentsList7 = listOf(
        StudentEntity(19, "Sam Thompson", "sam.thompson@example.com"),
        StudentEntity(20, "Tina Roberts", "tina.roberts@example.com"),
        StudentEntity(21, "Uma Patel", "uma.patel@example.com")
    )

    private val studentsList8 = listOf(
        StudentEntity(22, "Victor Evans", "victor.evans@example.com"),
        StudentEntity(23, "Wendy Carter", "wendy.carter@example.com"),
        StudentEntity(24, "Xander Clark", "xander.clark@example.com")
    )

    private val studentsList9 = listOf(
        StudentEntity(25, "Yara Gomez", "yara.gomez@example.com"),
        StudentEntity(26, "Zane Bailey", "zane.bailey@example.com"),
        StudentEntity(27, "Anita Kumar", "anita.kumar@example.com")
    )

    private val studentsList10 = listOf(
        StudentEntity(28, "Brian Morgan", "brian.morgan@example.com"),
        StudentEntity(29, "Cara Knight", "cara.knight@example.com"),
        StudentEntity(30, "Dylan Harper", "dylan.harper@example.com")
    )

    val courseList = listOf(
        CourseEntity(
            courseId = 101,
            title = "Introduction to Android Development",
            enrollment = 1500,
            duration = 40,
            category = "Technology",
            rating = 4.5,
            students = studentsList1
        ),
        CourseEntity(
            courseId = 102,
            title = "Advanced Android Techniques",
            enrollment = 1200,
            duration = 60,
            category = "Technology",
            rating = 4.7,
            students = studentsList2
        ),
        CourseEntity(
            courseId = 103,
            title = "Kotlin for Android Developers",
            enrollment = 1800,
            duration = 30,
            category = "Technology",
            rating = 4.6,
            students = studentsList3
        ),
        CourseEntity(
            courseId = 104,
            title = "Machine Learning for Mobile Apps",
            enrollment = 1000,
            duration = 50,
            category = "Data Science",
            rating = 4.8,
            students = studentsList4
        ),
        CourseEntity(
            courseId = 105,
            title = "UI/UX Design for Mobile Apps",
            enrollment = 1100,
            duration = 45,
            category = "Design",
            rating = 4.3,
            students = studentsList5
        ),
        CourseEntity(
            courseId = 106,
            title = "Database Management for Android",
            enrollment = 1200,
            duration = 55,
            category = "Technology",
            rating = 4.4,
            students = studentsList6
        ),
        CourseEntity(
            courseId = 107,
            title = "Cybersecurity Basics for Mobile",
            enrollment = 950,
            duration = 35,
            category = "Security",
            rating = 4.6,
            students = studentsList7
        ),
        CourseEntity(
            courseId = 108,
            title = "Cloud Integration in Mobile Apps",
            enrollment = 1500,
            duration = 50,
            category = "Cloud Computing",
            rating = 4.7,
            students = studentsList8
        ),
        CourseEntity(
            courseId = 109,
            title = "Artificial Intelligence in Mobile Apps",
            enrollment = 1300,
            duration = 70,
            category = "Artificial Intelligence",
            rating = 4.9,
            students = studentsList9
        ),
        CourseEntity(
            courseId = 110,
            title = "Blockchain for Mobile Development",
            enrollment = 1500,
            duration = 42,
            category = "Blockchain",
            rating = 4.8,
            students = studentsList10
        )
    )

}