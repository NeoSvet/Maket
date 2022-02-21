package ru.neosvet.maket.list

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.R
import ru.neosvet.maket.data.HomeTask
import ru.neosvet.maket.databinding.ItemTaskBinding
import ru.neosvet.maket.utils.TimeUtils
import ru.neosvet.maket.utils.getFadedColor
import ru.neosvet.maket.utils.getWarningColor

class TaskItem(
    private val binding: ItemTaskBinding
) : RecyclerView.ViewHolder(binding.root) {
    companion object {
        private const val LOW_DAYS = 3
    }

    init {
        binding.rvStudents.layoutManager = LinearLayoutManager(
            binding.root.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    fun setData(task: HomeTask) {
        with(binding) {
            tvName.text = task.name
            ivIcon.setImageResource(task.iconId)
            tvDescription.text = task.description
            val ctx = root.context
            val days = TimeUtils.getDaysLeft(task.deadLine)
            tvTime.text = String.format(
                ctx.getString(R.string.timeleft_format), days
            )
            if (days < LOW_DAYS)
                tvTime.setTextColor(ctx.getWarningColor())
            else
                tvTime.setTextColor(ctx.getFadedColor())
            val adapter = StudentsAdapter(task.students)
            rvStudents.adapter = adapter
        }
    }
}