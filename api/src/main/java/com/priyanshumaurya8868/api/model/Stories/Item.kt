package com.priyanshumaurya8868.api.model.Stories

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Item(
    @Json(name = "account_id")
    val accountId: Int?, // 39392078
    @Json(name = "account_url")
    val accountUrl: String?, // Caelux
    @Json(name = "ad_config")
    val adConfig: AdConfig?,
    @Json(name = "ad_type")
    val adType: Int?, // 0
    @Json(name = "ad_url")
    val adUrl: String?,
    @Json(name = "animated")
    val animated: Boolean?, // false
    @Json(name = "bandwidth")
    val bandwidth: Long?, // 879156066
    @Json(name = "comment_count")
    val commentCount: Int?, // 139
    @Json(name = "cover")
    val cover: String?, // mWkujEG
    @Json(name = "cover_height")
    val coverHeight: Int?, // 1528
    @Json(name = "cover_width")
    val coverWidth: Int?, // 1438
    @Json(name = "datetime")
    val datetime: Int?, // 1620530910
    @Json(name = "description")
    val description: Any?, // null
    @Json(name = "downs")
    val downs: Int?, // 134
    @Json(name = "edited")
    val edited: Int?, // 0
    @Json(name = "favorite")
    val favorite: Boolean?, // false
    @Json(name = "favorite_count")
    val favoriteCount: Int?, // 295
    @Json(name = "gifv")
    val gifv: String?, // https://i.imgur.com/WAnRcdS.gifv
    @Json(name = "has_sound")
    val hasSound: Boolean?, // false
    @Json(name = "height")
    val height: Int?, // 2073
    @Json(name = "hls")
    val hls: String?, // https://i.imgur.com/WAnRcdS.m3u8
    @Json(name = "id")
    val id: String?, // gFPWsOP
    @Json(name = "images")
    val images: List<Image>?,
    @Json(name = "images_count")
    val imagesCount: Int?, // 2
    @Json(name = "in_gallery")
    val inGallery: Boolean?, // true
    @Json(name = "in_most_viral")
    val inMostViral: Boolean?, // true
    @Json(name = "include_album_ads")
    val includeAlbumAds: Boolean?, // false
    @Json(name = "is_ad")
    val isAd: Boolean?, // false
    @Json(name = "is_album")
    val isAlbum: Boolean?, // true
    @Json(name = "layout")
    val layout: String?, // blog
    @Json(name = "link")
    val link: String?, // https://imgur.com/a/gFPWsOP
    @Json(name = "looping")
    val looping: Boolean?, // true
    @Json(name = "mp4")
    val mp4: String?, // https://i.imgur.com/WAnRcdS.mp4
    @Json(name = "mp4_size")
    val mp4Size: Int?, // 3477692
    @Json(name = "nsfw")
    val nsfw: Boolean?, // false
    @Json(name = "points")
    val points: Int?, // 2526
    @Json(name = "privacy")
    val privacy: String?, // hidden
    @Json(name = "processing")
    val processing: Processing?,
    @Json(name = "score")
    val score: Int?, // 2549
    @Json(name = "section")
    val section: String?,
    @Json(name = "size")
    val size: Int?, // 325734
    @Json(name = "tags")
    val tags: List<Tag>?,
    @Json(name = "title")
    val title: String?, // Over 5000 Iberians changed my gf's life!
    @Json(name = "topic")
    val topic: Any?, // null
    @Json(name = "topic_id")
    val topicId: Any?, // null
    @Json(name = "type")
    val type: String?, // image/jpeg
    @Json(name = "ups")
    val ups: Int?, // 2660
    @Json(name = "views")
    val views: Int?, // 46657
    @Json(name = "vote")
    val vote: Any?, // null
    @Json(name = "width")
    val width: Int? // 2764
)