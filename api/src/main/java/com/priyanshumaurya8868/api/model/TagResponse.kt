package com.priyanshumaurya8868.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TagResponse(
    @Json(name = "data")
    val `data`: TagData?,
    @Json(name = "status")
    val status: Int?, // 200
    @Json(name = "success")
    val success: Boolean? // true
)