package ru.neosvet.maket.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Fragment.setTitle(value: String) {
    activity?.title = value
}

fun Fragment.setSubtitle(value: String) {
    if (activity == null)
        return
    val act = activity as AppCompatActivity
    act.supportActionBar?.subtitle = value
}