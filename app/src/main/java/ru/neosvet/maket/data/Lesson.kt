package ru.neosvet.maket.data

data class Lesson(
    val name: String,
    val iconId: Int,
    val time: String,
    val teacherName: String,
    val description: String? = null,
    val students: List<Student>? = null,
    val videoLink: String? = null
)
