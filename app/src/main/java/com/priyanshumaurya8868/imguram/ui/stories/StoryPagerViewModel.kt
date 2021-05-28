package com.priyanshumaurya8868.imguram.ui.stories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.priyanshumaurya8868.api.model.Stories.Item
import com.priyanshumaurya8868.imguram.repository.ImgurRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StoryPagerViewModel : ViewModel() {
    private val repo = ImgurRepo()
    private val _storyPages = MutableLiveData<List<Item>>()
    val storyPages: LiveData<List<Item>> = _storyPages

    fun getTagsByName(tagName: String) = viewModelScope.launch(Dispatchers.IO) {
        repo.getTagsByName(tagName)?.data?.items?.let {
            _storyPages.postValue(it)
        }
    }
}




