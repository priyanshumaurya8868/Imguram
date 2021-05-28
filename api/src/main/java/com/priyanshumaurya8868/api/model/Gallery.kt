package com.priyanshumaurya8868.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Gallery(
    @Json(name = "description")
    val description: String?, // Today's most popular posts
    @Json(name = "id")
    val id: Int?, // 0
    @Json(name = "name")
    val name: String?, // Most Viral
    @Json(name = "topPost")
    val topPost: TopPost?
)