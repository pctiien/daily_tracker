package com.example.myapplication.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.view.fragment.AnalyzeFragment
import com.example.myapplication.view.fragment.CreateFragment
import com.example.myapplication.view.fragment.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    private lateinit var navigationBar : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationBar = findViewById(R.id.bottom_navigation)
        setUpNavigation()
    }
    private fun setUpNavigation()
    {
        var fragment : Fragment
        navigationBar.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.item_home -> {
                    // Respond to navigation item 1 click
                    fragment = HomeFragment()
                    loadFragment(fragment)
                    true
                }
                R.id.item_create -> {
                    // Respond to navigation item 2 click
                    fragment = CreateFragment()
                    loadFragment(fragment)
                    true
                }
                R.id.item_analyze -> {
                    // Respond to navigation item 2 click
                    fragment = AnalyzeFragment()
                    loadFragment(fragment)
                    true
                }
                else -> false
            }
        }
    }
    private fun loadFragment(fragment: Fragment) {
        val fragmentTransaction  = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main_layout,fragment)
        fragmentTransaction.commit()
    }
}