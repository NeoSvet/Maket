package ru.neosvet.maket

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import ru.neosvet.maket.data.FakeHome
import ru.neosvet.maket.data.HomeData
import ru.neosvet.maket.databinding.FragmentHomeBinding
import ru.neosvet.maket.list.HomeAdapter
import ru.neosvet.maket.utils.setSubtitle
import ru.neosvet.maket.utils.setTitle
import ru.neosvet.maket.utils.viewBinding

class HomeFragment : Fragment() {
    private val binding by viewBinding<FragmentHomeBinding>()
    private val repository: HomeData = FakeHome()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        setTitle(getString(R.string.welcome))
        setSubtitle("")
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_home, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    private fun initList() {
        val adapter = HomeAdapter(
            time = repository.getExamTime(),
            classesInfo = repository.getClassesInfo(),
            homework = repository.getHomework()
        )
        binding.rvHome.adapter = adapter
    }
}