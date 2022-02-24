package ru.neosvet.maket

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import ru.neosvet.maket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        initBottomNavigation()
        openFragment(HomeFragment())
    }

    private fun initBottomNavigation() = binding?.run {
        changeBottomItemSelected(R.id.bottom_view_home)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_view_home ->
                    openFragment(HomeFragment())
                R.id.bottom_view_classes ->
                    openFragment(ClassesFragment())
            }
            changeBottomItemSelected(item.itemId)
            return@setOnItemSelectedListener true
        }
    }

    private fun changeBottomItemSelected(selectedId: Int) = binding?.run {
        val menu = bottomNavigationView.getChildAt(0) as BottomNavigationMenuView
        menu.children.forEach {
            val item = it as BottomNavigationItemView
            item.getChildAt(0).layoutParams.apply {
                width = if (item.id == selectedId)
                    FrameLayout.LayoutParams.MATCH_PARENT
                else
                    FrameLayout.LayoutParams.WRAP_CONTENT
            }
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }
}