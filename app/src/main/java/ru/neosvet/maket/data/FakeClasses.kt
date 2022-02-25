package ru.neosvet.maket.data

class FakeClasses : ClassesData {
    private val currentLesson = FakeLessons.getHistory()

    override fun getLessons(): List<Lesson> =
        listOf(currentLesson, FakeLessons.getLiterature(), FakeLessons.getPhysicalEd())

    override fun getCurrentLesson(): Lesson =
        currentLesson
}