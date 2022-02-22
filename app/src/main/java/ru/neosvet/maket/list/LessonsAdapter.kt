package ru.neosvet.maket.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.Lesson
import ru.neosvet.maket.databinding.ItemBiglessonBinding
import ru.neosvet.maket.databinding.ItemLessonBinding

class LessonsAdapter(
    private val lessons: List<Lesson>,
    private val currentLesson: Int
) : RecyclerView.Adapter<BasicLessonItem>() {
    companion object {
        private const val NORMAL_LESSON = 0
        private const val BIG_LESSON = 1
    }

    override fun getItemViewType(position: Int): Int {
        return if (lessons[position].description == null)
            NORMAL_LESSON
        else
            BIG_LESSON
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicLessonItem =
        when (viewType) {
            NORMAL_LESSON -> LessonItem(
                ItemLessonBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> BigLessonItem( //BIG_LESSON
                ItemBiglessonBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }

    override fun onBindViewHolder(holder: BasicLessonItem, position: Int) {
        holder.setData(lessons[position])
        holder.setCurrent(currentLesson == position)
    }

    override fun getItemCount() = lessons.size
}