package com.priyanshumaurya8868.api.model.Stories


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TagResponseByName(
    @Json(name = "data")
    val `data`: TagsByNameData,
    @Json(name = "status")
    val status: Int?, // 200
    @Json(name = "success")
    val success: Boolean? // true
)