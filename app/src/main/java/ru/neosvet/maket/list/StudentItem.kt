package ru.neosvet.maket.list

import android.content.Context
import android.graphics.drawable.GradientDrawable
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.Student
import ru.neosvet.maket.databinding.ItemStudentBinding

class StudentItem(
    private val binding: ItemStudentBinding,
    strokeColor: Int
) : RecyclerView.ViewHolder(binding.root) {
    companion object {
        private var strokeWidth: Int = 0
        fun getStrokeWidth(context: Context): Int {
            if (strokeWidth == 0)
                strokeWidth = (2 * context.resources.displayMetrics.density).toInt()
            return strokeWidth
        }
    }

    init {
        val bg = binding.ivAvatar.background as GradientDrawable
        bg.mutate()
        bg.setStroke(
            getStrokeWidth(binding.root.context),
            strokeColor
        )
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