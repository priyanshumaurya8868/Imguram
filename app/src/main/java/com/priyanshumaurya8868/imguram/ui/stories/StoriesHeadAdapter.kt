package com.priyanshumaurya8868.imguram.ui.stories

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.Coil
import coil.load
import coil.request.ImageRequest
import com.priyanshumaurya8868.api.model.Tag
import com.priyanshumaurya8868.imguram.R
import com.priyanshumaurya8868.imguram.databinding.StoriesHeadListItemBinding

class StoriesHeadAdapter : ListAdapter<Tag, StoriesHeadAdapter.StoriesVH>(
    object : DiffUtil.ItemCallback<Tag>() {
        override fun areItemsTheSame(oldItem: Tag, newItem: Tag): Boolean = newItem == oldItem

        override fun areContentsTheSame(oldItem: Tag, newItem: Tag): Boolean =
            newItem.toString() == oldItem.toString()
//since Tag  is a data class so its toString exists  for sure
    }
) {
    inner class StoriesVH(val binding: StoriesHeadListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesVH {
        val inflater = parent.context.getSystemService(LayoutInflater::class.java)
        val binding = StoriesHeadListItemBinding.inflate(inflater, parent, false)
        return StoriesVH(binding)
    }

    override fun onBindViewHolder(holder: StoriesVH, position: Int) {
        val tag = getItem(position)
        holder.binding.apply {
            ivStoriesListItem.load("https://i.imgur.com/${tag.backgroundHash}.jpg")
            tvTitle.text = tag.displayName
            caching(position, ivStoriesListItem)
        }
        holder.binding.root.apply {
            setOnClickListener {
                val intent = Intent(context, StoryActivity::class.java)
                intent.putExtra("tag", tag.name)
                context.startActivity(intent)

            }
        }

    }

    private fun caching(position: Int, iv: ImageView) {
        for (i in 1..10) {
            val tag = try {
                getItem(position + i)
            } catch (e: IndexOutOfBoundsException) {
                null
            }
            val request = ImageRequest.Builder(iv.context)
                .data("https://i.imgur.com/${tag?.backgroundHash}.jpg")
                .size(iv.context.resources.getDimensionPixelSize(R.dimen.story_header_size))
                .build()
            Coil.imageLoader(iv.context).enqueue(request)
        }
    }

}
