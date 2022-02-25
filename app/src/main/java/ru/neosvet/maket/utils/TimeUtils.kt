package ru.neosvet.maket.utils

object TimeUtils {
    private const val DAY_IN_MILLS: Long = 86400000

    fun getDaysLeft(deadLine: Long): Int {
        val mills = deadLine - System.currentTimeMillis()
        return (mills / DAY_IN_MILLS).toInt()
    }

    fun getNowPlusDays(days: Int): Long =
        System.currentTimeMillis() + days * DAY_IN_MILLS + 600
}