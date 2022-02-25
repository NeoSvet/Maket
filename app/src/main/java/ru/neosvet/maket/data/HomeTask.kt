package ru.neosvet.maket.data

data class HomeTask(
    val name: String,
    val description: String,
    val iconId: Int,
    val deadLine: Long,
    val students: List<Student>
)
