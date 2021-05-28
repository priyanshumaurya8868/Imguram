package com.priyanshumaurya8868.imguram.ui.stories

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.priyanshumaurya8868.imguram.databinding.ActivityStoryBinding

class StoryActivity : AppCompatActivity() {
    private var _binding: ActivityStoryBinding? = null
    private val storyViewModel by viewModels<StoryPagerViewModel>()
    private val storyViewPagerAdapter = StoryViewPagerAdapter()
    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityStoryBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        intent.getStringExtra("tag")?.let {
            storyViewModel.getTagsByName(it)
        }
        _binding?.viewPager2?.apply {
            adapter = storyViewPagerAdapter
            registerOnPageChangeCallback(pageChangeCallBack)
        }
    }

    override fun onResume() {
        super.onResume()
        storyViewModel.storyPages.observe({ lifecycle }) {
            storyViewPagerAdapter.submitList(it)
        }
    }

    private val pageChangeCallBack = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            _binding?.apply {
                progressView.scaleX = 0f
                progressView.animate()?.cancel()
                progressView.animate().apply {
                    scaleX(1f)
                    duration = 5000
                    startDelay = 10
                }.start()

                handler.removeCallbacks(nextPage())
                handler.postDelayed(nextPage(), 5000)
            }
        }
    }

    private fun nextPage() = Runnable {
        _binding?.viewPager2?.let { it.currentItem++ }
    }

}