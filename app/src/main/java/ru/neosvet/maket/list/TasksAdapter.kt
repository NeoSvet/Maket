package ru.neosvet.maket.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.HomeTask
import ru.neosvet.maket.databinding.ItemTaskBinding

class TasksAdapter(
    private val tasks: List<HomeTask>
) : RecyclerView.Adapter<TaskItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TaskItem(
            ItemTaskBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: TaskItem, position: Int) {
        holder.setData(tasks[position])
    }

    override fun getItemCount() = tasks.size
}