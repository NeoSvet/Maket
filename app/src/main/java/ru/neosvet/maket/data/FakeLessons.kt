package ru.neosvet.maket.data

import ru.neosvet.maket.R

object FakeLessons {
    fun getHistory() = Lesson(
        name = "History",
        iconId = R.drawable.bow,
        teacherName = "Mrs. Thomas",
        time = "8:00 - 8:45",
        videoLink = "fake link"
    )

    fun getLiterature() = Lesson(
        name = "Literature",
        iconId = R.drawable.books,
        teacherName = "Mrs. Barros",
        time = "9:00 - 9:45"
    )

    fun getPhysicalEd() = Lesson(
        name = "Physical Education",
        iconId = R.drawable.ball,
        teacherName = "Mrs. Barros",
        time = "10:00 - 11:35",
        description = "Intensive preparation for The Junior World Championship in Los Angeles",
        students = listOf(
            Student(R.drawable.sportman1, -10421570), //#60fabe
            Student(R.drawable.sportman2, -10421570),
            Student(R.drawable.sportman3, -10421570)
        )
    )
}