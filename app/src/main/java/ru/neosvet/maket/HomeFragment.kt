package ru.neosvet.maket

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.fragment.app.Fragment
import ru.neosvet.maket.databinding.FragmentHomeBinding
import ru.neosvet.maket.utils.setSubtitle
import ru.neosvet.maket.utils.setTitle
import ru.neosvet.maket.utils.viewBinding

class HomeFragment : Fragment() {
    private val binding by viewBinding<FragmentHomeBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        setTitle(getString(R.string.welcome))
        setSubtitle("")
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_home, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}