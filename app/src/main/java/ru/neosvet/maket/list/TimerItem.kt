package ru.neosvet.maket.list

import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.ResidualTime
import ru.neosvet.maket.databinding.ItemTimerBinding
import ru.neosvet.maket.utils.getTens
import ru.neosvet.maket.utils.getUnits

class TimerItem(
    private val binding: ItemTimerBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun setData(time: ResidualTime) {
        binding.run {
            tvDays1.text = time.days.getTens().toString()
            tvDays2.text = time.days.getUnits().toString()
            tvHours1.text = time.hours.getTens().toString()
            tvHours2.text = time.hours.getUnits().toString()
            tvMinutes1.text = time.minutes.getTens().toString()
            tvMinutes2.text = time.minutes.getUnits().toString()
        }
    }
}