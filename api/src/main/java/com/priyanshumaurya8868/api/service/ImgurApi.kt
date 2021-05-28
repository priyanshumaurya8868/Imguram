package com.priyanshumaurya8868.api.service

import com.priyanshumaurya8868.api.model.GallaryResponse
import com.priyanshumaurya8868.api.model.Section
import com.priyanshumaurya8868.api.model.Stories.TagResponseByName
import com.priyanshumaurya8868.api.model.TagResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ImgurApi {

    @GET("gallery/{section}")
    suspend fun getGallery(
        @Path("section") section: Section,
        @Query("album_previews") album_previews: Boolean? = true
    ): Response<GallaryResponse>

    @GET("tags")
    suspend fun getTags(): Response<TagResponse>

    @GET("gallery/t/{tagName}")
    suspend fun getTagsByName(
        @Path("tagName") tagName: String
    ): Response<TagResponseByName>
}