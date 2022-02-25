package ru.neosvet.maket.list

import android.graphics.drawable.GradientDrawable
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.Student
import ru.neosvet.maket.databinding.ItemStudentBinding

class StudentItem(
    private val binding: ItemStudentBinding,
    bgId: Int
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.ivAvatar.setBackgroundResource(bgId)
    }

    fun setData(student: Student) {
        with(binding.ivAvatar) {
            setImageResource(student.avatarId)
            val bg = background as GradientDrawable
            bg.mutate()
            bg.setColor(student.backgroundColor)
        }
    }
}