package com.priyanshumaurya8868.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image(
    @Json(name = "account_id")
    val accountId: Any?, // null
    @Json(name = "account_url")
    val accountUrl: Any?, // null
    @Json(name = "ad_type")
    val adType: Int?, // 0
    @Json(name = "ad_url")
    val adUrl: String?,
    @Json(name = "animated")
    val animated: Boolean?, // false
    @Json(name = "bandwidth")
    val bandwidth: Long?, // 26253718570
    @Json(name = "comment_count")
    val commentCount: Any?, // null
    @Json(name = "datetime")
    val datetime: Int?, // 1620346740
    @Json(name = "description")
    val description: Any?, // null
    @Json(name = "downs")
    val downs: Any?, // null
    @Json(name = "edited")
    val edited: String?, // 0
    @Json(name = "favorite")
    val favorite: Boolean?, // false
    @Json(name = "favorite_count")
    val favoriteCount: Any?, // null
    @Json(name = "gifv")
    val gifv: String?, // https://i.imgur.com/hxtgtts.gifv
    @Json(name = "has_sound")
    val hasSound: Boolean?, // false
    @Json(name = "height")
    val height: Int?, // 3968
    @Json(name = "hls")
    val hls: String?, // https://i.imgur.com/hxtgtts.m3u8
    @Json(name = "id")
    val id: String?, // 2YsNNAH
    @Json(name = "in_gallery")
    val inGallery: Boolean?, // false
    @Json(name = "in_most_viral")
    val inMostViral: Boolean?, // false
    @Json(name = "is_ad")
    val isAd: Boolean?, // false
    @Json(name = "link")
    val link: String?, // https://i.imgur.com/2YsNNAH.jpg
    @Json(name = "mp4")
    val mp4: String?, // https://i.imgur.com/hxtgtts.mp4
    @Json(name = "mp4_size")
    val mp4Size: Int?, // 3128668
    @Json(name = "nsfw")
    val nsfw: Any?, // null
    @Json(name = "points")
    val points: Any?, // null
    @Json(name = "processing")
    val processing: Processing?,
    @Json(name = "score")
    val score: Any?, // null
    @Json(name = "section")
    val section: Any?, // null
    @Json(name = "size")
    val size: Int?, // 861710
    @Json(name = "tags")
    val tags: List<Any>?,
    @Json(name = "title")
    val title: Any?, // null
    @Json(name = "type")
    val type: String?, // image/jpeg
    @Json(name = "ups")
    val ups: Any?, // null
    @Json(name = "views")
    val views: Int?, // 30467
    @Json(name = "vote")
    val vote: Any?, // null
    @Json(name = "width")
    val width: Int? // 1784
)