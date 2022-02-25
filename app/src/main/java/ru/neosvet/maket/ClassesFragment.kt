package ru.neosvet.maket

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import ru.neosvet.maket.data.ClassesData
import ru.neosvet.maket.data.FakeClasses
import ru.neosvet.maket.databinding.FragmentClassesBinding
import ru.neosvet.maket.list.LessonsAdapter
import ru.neosvet.maket.utils.setSubtitle
import ru.neosvet.maket.utils.setTitle
import ru.neosvet.maket.utils.viewBinding

class ClassesFragment : Fragment() {
    private val binding by viewBinding<FragmentClassesBinding>()
    private val repository: ClassesData = FakeClasses()
    private lateinit var detailsItem: MenuItem
    private lateinit var iconsItem: MenuItem

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        setTitle(getString(R.string.classes))
        setSubtitle(getString(R.string.today))
        return inflater.inflate(R.layout.fragment_classes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_classes, menu)
        detailsItem = menu.getItem(1)
        iconsItem = menu.getItem(2)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_details -> setListMode(true)
            R.id.menu_icons -> setListMode(false)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setListMode(isDetails: Boolean) {
        if (isDetails) {
            detailsItem.setIcon(R.drawable.details_checked)
            iconsItem.setIcon(R.drawable.icons)
        } else {
            iconsItem.setIcon(R.drawable.icons_checked)
            detailsItem.setIcon(R.drawable.details)
        }
    }

    private fun initList() {
        val lessons = repository.getLessons()
        val adapter = LessonsAdapter(
            lessons = lessons,
            currentLesson = lessons.indexOf(repository.getCurrentLesson())
        )
        binding.rvClasses.adapter = adapter
    }
}