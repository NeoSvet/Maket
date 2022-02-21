package ru.neosvet.maket.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.neosvet.maket.data.Student
import ru.neosvet.maket.databinding.ItemStudentBinding

class StudentsAdapter(
    private val students: List<Student>
) : RecyclerView.Adapter<StudentItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        StudentItem(
            ItemStudentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: StudentItem, position: Int) {
        holder.setData(students[position])
    }

    override fun getItemCount() = students.size
}