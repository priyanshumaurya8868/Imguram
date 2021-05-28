package com.priyanshumaurya8868.imguram.ui.stories


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.Coil
import coil.load
import coil.request.ImageRequest
import com.priyanshumaurya8868.api.model.Stories.Item
import com.priyanshumaurya8868.imguram.databinding.StoriesPageListItemBinding

class StoryViewPagerAdapter : ListAdapter<Item, StoryViewPagerAdapter.StoryVH>(
    object : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean = newItem == oldItem
        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean =
            newItem.toString() == oldItem.toString()
    }
) {

    inner class StoryVH(val binding: StoriesPageListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryVH {
        val inflater = parent.context.getSystemService(LayoutInflater::class.java)
        val _binding = StoriesPageListItemBinding.inflate(inflater, parent, false)
        return StoryVH(_binding)
    }

    override fun onBindViewHolder(holder: StoryVH, position: Int) {
        val item = getItem(position)
        val imageLink = if (item.isAlbum == true && item.imagesCount != 0) {
            item.images?.get(0)?.link
        } else {
            item.link
        }
        holder.binding.apply {
            imageLink?.let {
                imageViewStoryPage.load(it)
                tvstoryPage.text = imageLink
                loadNext(position, imageViewStoryPage)
            }
        }
    }


    private fun loadNext(position: Int, imageViewStoryPage: ImageView) {
        var imageLink: String? = null
        if (currentList.size > (position + 1)) {
            val item = getItem(position + 1)
            imageLink = if (item.isAlbum == true && item.imagesCount != 0) item.images?.get(0)?.link
            else item.link
        }

        val request = ImageRequest.Builder(imageViewStoryPage.context)
            .data(imageLink)
            .build()
        Coil.imageLoader(imageViewStoryPage.context).enqueue(request)
    }
}

