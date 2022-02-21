package ru.neosvet.maket.list

import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.Student
import ru.neosvet.maket.databinding.ItemStudentBinding

class StudentItem(
    private val binding: ItemStudentBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun setData(student: Student) {
        with(binding.ivAvatar) {
            setImageResource(student.avatarId)
            setBackgroundResource(student.backgroundId)
        }
    }
}