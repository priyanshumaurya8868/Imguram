package com.priyanshumaurya8868.imguram.repository

import com.priyanshumaurya8868.api.model.GalleryData
import com.priyanshumaurya8868.api.model.Section
import com.priyanshumaurya8868.api.service.ImgurClient

class ImgurRepo {

    private val api = ImgurClient.api

    suspend fun getHotFeed() =
        api.getGallery(Section.HOT).body()?.data //TODO:return correct error body

    suspend fun getTopFeed(): List<GalleryData>? {
        val response = api.getGallery(Section.TOP).body()
        return response?.data
    }

    suspend fun getTags() = api.getTags().body()
    suspend fun getTagsByName(tagName: String) = api.getTagsByName(tagName).body()

}