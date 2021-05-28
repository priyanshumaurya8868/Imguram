package com.priyanshumaurya8868.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TagData(
    @Json(name = "featured")
    val featured: String?, // space
    @Json(name = "galleries")
    val galleries: List<Gallery>?,
    @Json(name = "tags")
    val tags: List<Tag>?
)