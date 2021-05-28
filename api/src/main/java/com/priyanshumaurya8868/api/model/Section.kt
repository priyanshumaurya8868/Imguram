package com.priyanshumaurya8868.api.model

import com.squareup.moshi.Json

enum class Section {
    @Json(name = "hot")
    HOT,

    @Json(name = "top")
    TOP
}