package ru.neosvet.maket.data

interface HomeData {
    fun getExamTime(): ResidualTime
    fun getClassesInfo(): ClassesInfo
    fun getHomework(): List<HomeTask>
}