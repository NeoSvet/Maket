package ru.neosvet.maket.list

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.R
import ru.neosvet.maket.data.Lesson

abstract class BasicLessonItem(view: View) : RecyclerView.ViewHolder(view) {
    protected abstract val ivTimedot: ImageView
    abstract fun setData(lesson: Lesson)
    fun setCurrent(value: Boolean) {
        ivTimedot.setImageResource(
            if (value) R.drawable.big_time_dot else R.drawable.normal_time_dot
        )
    }
}