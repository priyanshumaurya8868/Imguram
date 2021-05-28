package com.priyanshumaurya8868.imguram.ui.stories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.priyanshumaurya8868.api.model.Tag
import com.priyanshumaurya8868.imguram.repository.ImgurRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StoriesHeadViewModel : ViewModel() {
    private val repo = ImgurRepo()
    private val _storiesHead = MutableLiveData<List<Tag>>()
    val storiesHead: LiveData<List<Tag>> = _storiesHead


    fun getTags() = viewModelScope.launch(Dispatchers.IO) {
        repo.getTags()?.data?.tags?.let {
            _storiesHead.postValue(it)
            Log.d("STORIES", "tagList recieved : ${it.size}")
        }


    }
}