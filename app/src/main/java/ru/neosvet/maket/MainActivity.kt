package ru.neosvet.maket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.neosvet.maket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        initBottomNavigation()
    }

    private fun initBottomNavigation() = binding?.run{
        bottomNavigationView.setOnItemSelectedListener {  item ->
            when(item.itemId) {
                R.id.bottom_view_home -> {

                }
                R.id.bottom_view_classes -> {

                }
            }
            changeBottomItemSelected(item.itemId)
            return@setOnItemSelectedListener true
        }
    }
}