package ru.neosvet.maket.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.R
import ru.neosvet.maket.data.ClassesInfo
import ru.neosvet.maket.databinding.ItemClassesBinding

class ClassesItem(
    private val binding: ItemClassesBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun setData(info: ClassesInfo) {
        with(binding) {
            tvCount.text = String.format(
                root.context.getString(R.string.classes_format),
                info.countToday
            )
            val lesson = info.currentLesson
            tvName.text = lesson.name
            ivIcon.setImageResource(lesson.iconId)
            tvTime.text = String.format(
                root.context.getString(R.string.time_format),
                lesson.time
            )
            pLink.visibility = if (lesson.videoLink == null) View.GONE else View.VISIBLE
        }
    }
}