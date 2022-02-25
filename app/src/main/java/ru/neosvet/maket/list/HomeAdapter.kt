package ru.neosvet.maket.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.ClassesInfo
import ru.neosvet.maket.data.HomeTask
import ru.neosvet.maket.data.ResidualTime
import ru.neosvet.maket.databinding.ItemClassesBinding
import ru.neosvet.maket.databinding.ItemHomeworkBinding
import ru.neosvet.maket.databinding.ItemTimerBinding

class HomeAdapter(
    private val time: ResidualTime,
    private val classesInfo: ClassesInfo,
    private val homework: List<HomeTask>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val COUNT_SECTIONS = 3
        private const val TIMER_SECTION = 0
        private const val CLASSES_SECTION = 1
        private const val HOMEWORK_SECTION = 2
    }

    override fun getItemViewType(position: Int) = position

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            TIMER_SECTION -> TimerItem(
                ItemTimerBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            CLASSES_SECTION -> ClassesItem(
                ItemClassesBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> //HOMEWORK_SECTION
                HomeworkItem(
                    ItemHomeworkBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (position) {
            TIMER_SECTION ->
                (holder as TimerItem).setData(time)
            CLASSES_SECTION ->
                (holder as ClassesItem).setData(classesInfo)
            HOMEWORK_SECTION ->
                (holder as HomeworkItem).setData(homework)
        }
    }

    override fun getItemCount() = COUNT_SECTIONS
}