package com.example.mad2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val home: ImageView = findViewById(R.id.homeunselect)
        val goals:ImageView = findViewById(R.id.goals)
        val add:ImageView = findViewById(R.id.add)
        val stats:ImageView = findViewById(R.id.stats)
        val settings:ImageView = findViewById(R.id.settings)

        val fragmentadd = Fragment()
        val fragmentHome = home()
        add.setOnClickListener {
            add.setImageResource(R.drawable.add)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView3,fragmentadd)
                commit()
            }
        }
//        goals.setOnClickListener {
//            goals.setImageResource(R.drawable.selected_target)
//
//            supportFragmentManager.beginTransaction().apply {
//                //replace(R.id.fragmentContainerView,addfragment )
//                commit()
//            }
//        }
//        add.setOnClickListener {
//            stats.setImageResource(R.drawable.selected_stats)
//            supportFragmentManager.beginTransaction().apply {
//               // replace(R.id.fragmentContainerView,addfragment )
//                commit()
//            }
//        }
//        settings.setOnClickListener {
//            add.setImageResource(R.drawable.selected_settings)
//            supportFragmentManager.beginTransaction().apply {
//                //replace(R.id.fragmentContainerView,addfragment )
//                commit()
//            }
//        }
        home.setOnClickListener {
            home.setImageResource(R.drawable.home)
            goals.setImageResource(R.drawable.target)
            stats.setImageResource(R.drawable.stats)
            settings.setImageResource(R.drawable.settings)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView3, fragmentHome)
                commit()
            }
        }
    }
}