package com.priyanshumaurya8868.api.model.Stories


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
    val bandwidth: Long?, // 7038457704
    @Json(name = "comment_count")
    val commentCount: Any?, // null
    @Json(name = "datetime")
    val datetime: Int?, // 1620530358
    @Json(name = "description")
    val description: String?, // TLDR- IMGURIANS ARE THE BEST!My gf went live to over 5000 Imgurians last night for 16 HOURS STRAIGHT! Her mind was completely blown and she can't thank yall enough for all the support yall gave her! She wants to stream every minute she can now and she's more excited about it than ever before.
    @Json(name = "downs")
    val downs: Any?, // null
    @Json(name = "edited")
    val edited: String?, // 0
    @Json(name = "favorite")
    val favorite: Boolean?, // false
    @Json(name = "favorite_count")
    val favoriteCount: Any?, // null
    @Json(name = "gifv")
    val gifv: String?, // https://i.imgur.com/BatBQ5y.gifv
    @Json(name = "has_sound")
    val hasSound: Boolean?, // false
    @Json(name = "height")
    val height: Int?, // 1528
    @Json(name = "hls")
    val hls: String?, // https://i.imgur.com/BatBQ5y.m3u8
    @Json(name = "id")
    val id: String?, // mWkujEG
    @Json(name = "in_gallery")
    val inGallery: Boolean?, // false
    @Json(name = "in_most_viral")
    val inMostViral: Boolean?, // false
    @Json(name = "is_ad")
    val isAd: Boolean?, // false
    @Json(name = "link")
    val link: String?, // https://i.imgur.com/mWkujEG.jpg
    @Json(name = "looping")
    val looping: Boolean?, // true
    @Json(name = "mp4")
    val mp4: String?, // https://i.imgur.com/BatBQ5y.mp4
    @Json(name = "mp4_size")
    val mp4Size: Int?, // 3811064
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
    val size: Int?, // 221586
    @Json(name = "tags")
    val tags: List<Any>?,
    @Json(name = "title")
    val title: Any?, // null
    @Json(name = "type")
    val type: String?, // image/jpeg
    @Json(name = "ups")
    val ups: Any?, // null
    @Json(name = "views")
    val views: Int?, // 31764
    @Json(name = "vote")
    val vote: Any?, // null
    @Json(name = "width")
    val width: Int? // 1438
)