package ru.neosvet.maket.list

import android.view.View
import android.widget.ImageView
import ru.neosvet.maket.R
import ru.neosvet.maket.data.Lesson
import ru.neosvet.maket.databinding.ItemLessonBinding

class LessonItem(
    private val binding: ItemLessonBinding
) : BasicLessonItem(binding.root) {
    override val ivTimedot: ImageView
        get() = binding.ivTimedot

    override fun setData(lesson: Lesson) {
        with(binding) {
            tvTime.text = lesson.time
            tvName.text = lesson.name
            ivIcon.setImageResource(lesson.iconId)
            tvTeacher.text = String.format(
                root.context.getString(R.string.teacher_format),
                lesson.teacherName
            )
            pLink.visibility = if (lesson.videoLink == null) View.GONE else View.VISIBLE
        }
    }
}