package ru.neosvet.maket.data

import ru.neosvet.maket.R
import ru.neosvet.maket.utils.TimeUtils

class FakeHome : HomeData {
    override fun getExamTime(): ResidualTime {
        return ResidualTime(
            days = 9,
            hours = 23,
            minutes = 59
        )
    }

    override fun getClassesInfo(): ClassesInfo {
        return ClassesInfo(
            countToday = 6,
            currentLesson = FakeLessons.getHistory()
        )
    }

    override fun getHomework(): List<HomeTask> {
        return listOf(
            getLiteratureTask(),
            getPhysicsTask()
        )
    }

    private fun getLiteratureTask(): HomeTask {
        return HomeTask(
            name = "Literature",
            iconId = R.drawable.books,
            deadLine = TimeUtils.getNowPlusDays(2),
            description = "Read scenes 1.1-1.12 of The Master and Margarita.",
            students = listOf(
                Student(R.drawable.man, R.drawable.student_bg1),
                Student(R.drawable.woman, R.drawable.student_bg2)
            )
        )
    }

    private fun getPhysicsTask(): HomeTask {
        return HomeTask(
            name = "Physics",
            iconId = R.drawable.phisics,
            deadLine = TimeUtils.getNowPlusDays(5),
            description = "Learn Newtons's laws motion",
            students = listOf(
                Student(R.drawable.man2, R.drawable.student_bg3),
                Student(R.drawable.woman2, R.drawable.student_bg4)
            )
        )
    }
}