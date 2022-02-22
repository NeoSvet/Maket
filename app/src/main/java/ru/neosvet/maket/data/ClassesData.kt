package ru.neosvet.maket.data

interface ClassesData {
    fun getLessons(): List<Lesson>
    fun getCurrentLesson(): Lesson
}