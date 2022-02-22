package ru.neosvet.maket.list

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import ru.neosvet.maket.R
import ru.neosvet.maket.data.Lesson
import ru.neosvet.maket.databinding.ItemBiglessonBinding

class BigLessonItem(
    private val binding: ItemBiglessonBinding
) : BasicLessonItem(binding.root) {
    override val ivTimedot: ImageView
        get() = binding.ivTimedot

    init {
        binding.rvStudents.layoutManager = LinearLayoutManager(
            binding.root.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    override fun setData(lesson: Lesson) {
        with(binding) {
            tvTime.text = lesson.time
            tvName.text = lesson.name
            ivIcon.setImageResource(lesson.iconId)
            tvTeacher.text = String.format(
                root.context.getString(R.string.teacher_format),
                lesson.teacherName
            )
            tvDescription.text = lesson.description
            pLink.visibility = if (lesson.videoLink == null) View.GONE else View.VISIBLE
            lesson.students?.let {
                val adapter = StudentsAdapter(it)
                rvStudents.adapter = adapter
            }
        }
    }

}