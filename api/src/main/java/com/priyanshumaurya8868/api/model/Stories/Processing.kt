package com.priyanshumaurya8868.api.model.Stories


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Processing(
    @Json(name = "status")
    val status: String? // completed
)