package com.priyanshumaurya8868.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopPost(
    @Json(name = "account_id")
    val accountId: Int?, // 28547257
    @Json(name = "account_url")
    val accountUrl: String?, // tronicles
    @Json(name = "ad_type")
    val adType: Int?, // 0
    @Json(name = "ad_url")
    val adUrl: String?,
    @Json(name = "animated")
    val animated: Boolean?, // false
    @Json(name = "bandwidth")
    val bandwidth: Long?, // 311795799
    @Json(name = "comment_count")
    val commentCount: Int?, // 142
    @Json(name = "cover")
    val cover: String?, // aBDaudp
    @Json(name = "cover_height")
    val coverHeight: Int?, // 554
    @Json(name = "cover_width")
    val coverWidth: Int?, // 796
    @Json(name = "datetime")
    val datetime: Int?, // 1620345463
    @Json(name = "description")
    val description: Any?, // null
    @Json(name = "downs")
    val downs: Int?, // 70
    @Json(name = "edited")
    val edited: Int?, // 0
    @Json(name = "favorite")
    val favorite: Any?, // null
    @Json(name = "favorite_count")
    val favoriteCount: Int?, // 49
    @Json(name = "has_sound")
    val hasSound: Boolean?, // false
    @Json(name = "height")
    val height: Int?, // 544
    @Json(name = "id")
    val id: String?, // zB7g6b7
    @Json(name = "images")
    val images: List<Image>?,
    @Json(name = "images_count")
    val imagesCount: Int?, // 1
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
    val link: String?, // https://imgur.com/a/zB7g6b7
    @Json(name = "nsfw")
    val nsfw: Boolean?, // false
    @Json(name = "points")
    val points: Int?, // 1149
    @Json(name = "privacy")
    val privacy: String?, // hidden
    @Json(name = "score")
    val score: Int?, // 1157
    @Json(name = "section")
    val section: String?,
    @Json(name = "size")
    val size: Int?, // 40827
    @Json(name = "tags")
    val tags: List<Tag>?,
    @Json(name = "title")
    val title: String?, // A gentle reminder from Jeff
    @Json(name = "topic")
    val topic: Any?, // null
    @Json(name = "topic_id")
    val topicId: Any?, // null
    @Json(name = "type")
    val type: String?, // image/jpeg
    @Json(name = "ups")
    val ups: Int?, // 1219
    @Json(name = "views")
    val views: Int?, // 17787
    @Json(name = "vote")
    val vote: Any?, // null
    @Json(name = "width")
    val width: Int? // 500
)