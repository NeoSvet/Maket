package ru.neosvet.maket

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.fragment.app.Fragment
import ru.neosvet.maket.databinding.FragmentClassesBinding
import ru.neosvet.maket.utils.setSubtitle
import ru.neosvet.maket.utils.setTitle
import ru.neosvet.maket.utils.viewBinding

class ClassesFragment : Fragment() {
    private val binding by viewBinding<FragmentClassesBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        setTitle(getString(R.string.classes))
        setSubtitle(getString(R.string.today))
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_classes, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}