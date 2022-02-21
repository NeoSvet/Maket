package ru.neosvet.maket.utils

import android.content.Context
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import ru.neosvet.maket.R

fun Fragment.setTitle(value: String) {
    activity?.title = value
}

fun Fragment.setSubtitle(value: String) {
    if (activity == null)
        return
    val act = activity as AppCompatActivity
    act.supportActionBar?.subtitle = value
}

fun Context.getFadedColor(): Int {
    val typedValue = TypedValue()
    theme.resolveAttribute(R.attr.colorFaded, typedValue, true)
    return typedValue.data
}

fun Context.getWarningColor(): Int {
    val typedValue = TypedValue()
    theme.resolveAttribute(R.attr.colorWarning, typedValue, true)
    return typedValue.data
}