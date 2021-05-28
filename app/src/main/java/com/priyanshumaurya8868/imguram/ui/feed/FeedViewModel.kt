package com.priyanshumaurya8868.imguram.ui.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.priyanshumaurya8868.api.model.GalleryData
import com.priyanshumaurya8868.imguram.repository.ImgurRepo
import kotlinx.coroutines.launch

class FeedViewModel : ViewModel() {

    private val repo = ImgurRepo()
//    private val _feed = MutableLiveData<List<GalleryData>>()
//            val feed : LiveData<List<GalleryData>> = _feed

    private val _hotFeed = MutableLiveData<List<GalleryData>>()
    val hotFeed: LiveData<List<GalleryData>> = _hotFeed

    private val _topFeed = MutableLiveData<List<GalleryData>>()
    val topFeed: LiveData<List<GalleryData>> = _topFeed

    init {
        getHotFeed()
        getTopFeed()
    }


    fun getHotFeed() = viewModelScope.launch {
        val response = repo.getHotFeed()
        if (response != null)
            _hotFeed.postValue(response!!)
    }

    fun getTopFeed() = viewModelScope.launch {
        val response = repo.getTopFeed()
        if (response != null)
            _topFeed.postValue(response!!)
    }

}