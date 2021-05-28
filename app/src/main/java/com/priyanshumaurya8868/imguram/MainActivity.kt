package com.priyanshumaurya8868.imguram

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.priyanshumaurya8868.imguram.databinding.ActivityMainBinding
import com.priyanshumaurya8868.imguram.ui.stories.StoriesHeadAdapter
import com.priyanshumaurya8868.imguram.ui.stories.StoriesHeadViewModel

class MainActivity : AppCompatActivity() {
    private val storiesViewModel by viewModels<StoriesHeadViewModel>()
    private var _binding: ActivityMainBinding? = null
    private val storiesAdapter = StoriesHeadAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        setupNavView()
        storiesViewModel.getTags()
    }

    private fun setupNavView() {
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        /*
         NOTE: we r not using  appconfig/action bar in this app
         --------------Action bar code -------------------
     //          Passing each menu ID as a set of Ids because each
     //         menu should be considered as top level destinations.
     //          val appBarConfiguration = AppBarConfiguration(setOf(
     //            R.id.navigation_hot, R.id.navigation_trending))
     //           setupActionBarWithNavController(navController, appBarConfiguration)
     //        since we hv disabled it from theme
           --------------Action bar code -------------------
            */
        navView.setupWithNavController(navController)
    }

    override fun onResume() {
        super.onResume()
        _binding?.apply {
            rvStories.layoutManager = LinearLayoutManager(
                this@MainActivity,
                RecyclerView.HORIZONTAL, false
            )
            rvStories.adapter = storiesAdapter
        }
        storiesViewModel.storiesHead.observe({ lifecycle }) {
            storiesAdapter.submitList(it)
        }
    }
}