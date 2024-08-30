package com.fadenai.dataprocessing.data.sample1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class Sample1Repository {

    suspend fun getSimpleData(): List<String> = withContext(Dispatchers.IO) {

        delay(1000)

        processData()
    }

    private fun processData(): List<String> {
        return rawData()
            .asSequence()
            .filter { it.enrollment >= 500 } // Min is 500
            .sortedWith(
                compareByDescending<Sample1Course> { it.enrollment / it.duration }
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


    private fun rawData(): List<Sample1Course> {

        return listOf(
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
                courseId = 1,
                title = "Kotlin for Android Developers",
                enrollment = 1200,
                duration = 20,
                category = "Android"
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
            Sample1Course(
                courseId = 9,
                title = "Introduction to Algorithms",
                enrollment = 1000,
                duration = 40,
                category = "Programming"
            ),
            Sample1Course(
                courseId = 10,
                title = "Modern Android Development with Jetpack",
                enrollment = 900,
                duration = 18,
                category = "Android"
            ),
            Sample1Course(
                courseId = 11,
                title = "Natural Language Processing with Python",
                enrollment = 600,
                duration = 35,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 12,
                title = "Advanced Python Programming",
                enrollment = 750,
                duration = 25,
                category = "Programming"
            ),
            Sample1Course(
                courseId = 13,
                title = "Clean Code with Kotlin",
                enrollment = 400,
                duration = 15,
                category = "Programming"
            ),
            Sample1Course(
                courseId = 14,
                title = "Mobile App Security Essentials",
                enrollment = 650,
                duration = 20,
                category = "Android"
            ),
            Sample1Course(
                courseId = 15,
                title = "Computer Vision with OpenCV",
                enrollment = 550,
                duration = 30,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 16,
                title = "Introduction to Data Science with R",
                enrollment = 1300,
                duration = 25,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 17,
                title = "Android Performance Optimization",
                enrollment = 1100,
                duration = 15,
                category = "Android"
            ),
            Sample1Course(
                courseId = 18,
                title = "Microservices Architecture with Spring Boot",
                enrollment = 850,
                duration = 40,
                category = "Programming"
            ),
            Sample1Course(
                courseId = 19,
                title = "Blockchain Essentials",
                enrollment = 400,
                duration = 20,
                category = "Programming"
            ),
            Sample1Course(
                courseId = 20,
                title = "Ethical Hacking for Beginners",
                enrollment = 1200,
                duration = 10,
                category = "Cybersecurity"
            ),
            Sample1Course(
                courseId = 21,
                title = "Introduction to Cybersecurity",
                enrollment = 1400,
                duration = 30,
                category = "Cybersecurity"
            ),
            Sample1Course(
                courseId = 22,
                title = "Full-Stack Web Development with React",
                enrollment = 950,
                duration = 50,
                category = "Web Development"
            ),
            Sample1Course(
                courseId = 23,
                title = "Data Visualization with D3.js",
                enrollment = 600,
                duration = 20,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 24,
                title = "Android Game Development with Unity",
                enrollment = 800,
                duration = 45,
                category = "Android"
            ),
            Sample1Course(
                courseId = 25,
                title = "Cloud Computing with AWS",
                enrollment = 1200,
                duration = 35,
                category = "Cloud Computing"
            ),
            Sample1Course(
                courseId = 26,
                title = "DevOps with Docker and Kubernetes",
                enrollment = 1000,
                duration = 30,
                category = "Cloud Computing"
            ),
            Sample1Course(
                courseId = 27,
                title = "Introduction to Big Data",
                enrollment = 1300,
                duration = 25,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 28,
                title = "Data Engineering with Apache Spark",
                enrollment = 750,
                duration = 40,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 29,
                title = "Machine Learning with Scikit-Learn",
                enrollment = 1100,
                duration = 20,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 30,
                title = "Mobile UI/UX Design",
                enrollment = 900,
                duration = 10,
                category = "Design"
            ),
            Sample1Course(
                courseId = 31,
                title = "Introduction to UI/UX Design",
                enrollment = 1400,
                duration = 15,
                category = "Design"
            ),
            Sample1Course(
                courseId = 32,
                title = "Design Thinking for Innovation",
                enrollment = 800,
                duration = 10,
                category = "Design"
            ),
            Sample1Course(
                courseId = 33,
                title = "Intro to Cloud Native Development",
                enrollment = 950,
                duration = 30,
                category = "Cloud Computing"
            ),
            Sample1Course(
                courseId = 34,
                title = "Data Mining Techniques",
                enrollment = 500,
                duration = 25,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 35,
                title = "Operating Systems Concepts",
                enrollment = 450,
                duration = 30,
                category = "Programming"
            ),
            Sample1Course(
                courseId = 36,
                title = "Agile Project Management",
                enrollment = 1200,
                duration = 15,
                category = "Project Management"
            ),
            Sample1Course(
                courseId = 37,
                title = "Digital Marketing Strategies",
                enrollment = 1100,
                duration = 20,
                category = "Marketing"
            ),
            Sample1Course(
                courseId = 38,
                title = "SEO Fundamentals",
                enrollment = 1300,
                duration = 10,
                category = "Marketing"
            ),
            Sample1Course(
                courseId = 39,
                title = "Python for Data Analysis",
                enrollment = 1250,
                duration = 30,
                category = "Data Science"
            ),
            Sample1Course(
                courseId = 40,
                title = "Cloud Security Fundamentals",
                enrollment = 900,
                duration = 25,
                category = "Cybersecurity"
            )
        )

    }
}