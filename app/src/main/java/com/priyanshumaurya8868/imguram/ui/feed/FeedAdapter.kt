package com.priyanshumaurya8868.imguram.ui.feed

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.Coil
import coil.load
import coil.request.ImageRequest
import com.priyanshumaurya8868.api.model.GalleryData
import com.priyanshumaurya8868.imguram.databinding.ListItemBinding

class FeedAdapter : ListAdapter<GalleryData, FeedAdapter.FeedViewHolder>(object :
    DiffUtil.ItemCallback<GalleryData>() {
    override fun areItemsTheSame(oldItem: GalleryData, newItem: GalleryData): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: GalleryData, newItem: GalleryData): Boolean {
        return oldItem.toString() == newItem.toString()
    }

}) {

    inner class FeedViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        val inflater: LayoutInflater = parent.context.getSystemService(LayoutInflater::class.java)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return FeedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        val galleryData = getItem(position)
        val imageLink = if (galleryData.imagesCount != 0 && galleryData.isAlbum == true) {
            galleryData.images?.get(0)?.link
        } else "https://i.imgur.com/${galleryData.cover}.jpg"
        Log.d("FEED", "post link -: $imageLink")
        holder.binding.ivListItem.load(imageLink)
        holder.binding.tvCaption.text = galleryData.title
        cacheing(position, holder.binding.ivListItem)
    }

    private fun cacheing(position: Int, ivListItem: ImageView) {
        for (i in 1..5) {
            val galleryData = try {
                getItem(position + i)
            } catch (e: IndexOutOfBoundsException) {
                null
            }
            val imageLink = if (galleryData?.imagesCount != 0 && galleryData?.isAlbum == true) {
                galleryData.images?.get(0)?.link
            } else "https://i.imgur.com/${galleryData?.cover}.jpg"
            val request = ImageRequest.Builder(ivListItem.context).apply {
                data(imageLink)
                if (ivListItem.width > 0) size(ivListItem.width)
            }.build()
            Coil.imageLoader(ivListItem.context).enqueue(request)
        }
    }
}