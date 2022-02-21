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
}