package com.priyanshumaurya8868.imguram.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.priyanshumaurya8868.imguram.R
import com.priyanshumaurya8868.imguram.databinding.FeedFragmentBinding

class FeedFragment : Fragment() {

    private var _binding: FeedFragmentBinding? = null
    private val feedAdapter = FeedAdapter()
    private val viewModel: FeedViewModel by viewModels()//via this there would be a seper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //   viewModel = ViewModelProvider(this).get(FeedViewModel::class.java)
        arguments?.let {
            updateFeed(
                it.getString(
                    resources.getString(R.string.feed_arg)
                )!!
            )
        }
    }

    private fun updateFeed(section: String) {
        when (section) {
            "hot" -> {
                viewModel.hotFeed.observe({ lifecycle }) {
                    feedAdapter.submitList(it)
                }
            }
            "top" -> {
                viewModel.topFeed.observe({ lifecycle }) {
                    feedAdapter.submitList(it)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FeedFragmentBinding.inflate(inflater, container, false)

        return _binding?.root
    }

    override fun onResume() {
        super.onResume()
        _binding?.rvFeed?.layoutManager = LinearLayoutManager(requireContext())
        _binding?.rvFeed?.adapter = feedAdapter

    }
}


