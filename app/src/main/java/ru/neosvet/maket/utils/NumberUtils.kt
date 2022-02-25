package ru.neosvet.maket.utils

fun Int.getTens(): Int =
    this.div(10)

fun Int.getUnits(): Int =
    this.rem(10)