package ru.neosvet.maket.list

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.HomeTask
import ru.neosvet.maket.databinding.ItemHomeworkBinding

class HomeworkItem(
    private val binding: ItemHomeworkBinding
) : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.rvTasks.layoutManager = LinearLayoutManager(
            binding.root.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
    }

    fun setData(tasks: List<HomeTask>) {
        val adapter = TasksAdapter(tasks)
        binding.rvTasks.adapter = adapter
    }
}