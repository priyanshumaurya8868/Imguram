package com.priyanshumaurya8868.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GalleryData(
    @Json(name = "account_id")
    val accountId: Int?, // 61184349
    @Json(name = "account_url")
    val accountUrl: String?, // knightmage15
    @Json(name = "ad_config")
    val adConfig: AdConfig?,
    @Json(name = "ad_type")
    val adType: Int?, // 0
    @Json(name = "ad_url")
    val adUrl: String?,
    @Json(name = "animated")
    val animated: Boolean?, // true
    @Json(name = "bandwidth")
    val bandwidth: Long?, // 27750669014576
    @Json(name = "comment_count")
    val commentCount: Int?, // 148
    @Json(name = "cover")
    val cover: String?, // 2YsNNAH
    @Json(name = "cover_height")
    val coverHeight: Int?, // 3968
    @Json(name = "cover_width")
    val coverWidth: Int?, // 1784
    @Json(name = "datetime")
    val datetime: Int?, // 1620346773
    @Json(name = "description")
    val description: Any?, // null
    @Json(name = "downs")
    val downs: Int?, // 51
    @Json(name = "edited")
    val edited: Int?, // 0
    @Json(name = "favorite")
    val favorite: Boolean?, // false
    @Json(name = "favorite_count")
    val favoriteCount: Int?, // 163
    @Json(name = "gifv")
    val gifv: String?, // https://i.imgur.com/puN2ogj.gifv
    @Json(name = "has_sound")
    val hasSound: Boolean?, // false
    @Json(name = "height")
    val height: Int?, // 1294
    @Json(name = "hls")
    val hls: String?, // https://i.imgur.com/puN2ogj.m3u8
    @Json(name = "id")
    val id: String?, // utgrQDM
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
    val link: String?, // https://imgur.com/a/utgrQDM
    @Json(name = "looping")
    val looping: Boolean?, // true
    @Json(name = "mp4")
    val mp4: String?, // https://i.imgur.com/puN2ogj.mp4
    @Json(name = "mp4_size")
    val mp4Size: Int?, // 3811695
    @Json(name = "nsfw")
    val nsfw: Boolean?, // false
    @Json(name = "points")
    val points: Int?, // 2568
    @Json(name = "privacy")
    val privacy: String?, // hidden
    @Json(name = "processing")
    val processing: Processing?,
    @Json(name = "score")
    val score: Int?, // 2589
    @Json(name = "section")
    val section: String?,
    @Json(name = "size")
    val size: Int?, // 61586312
    @Json(name = "tags")
    val tags: List<Tag>?,
    @Json(name = "title")
    val title: String?, // He-Man : Masters of the Universe
    @Json(name = "topic")
    val topic: Any?, // null
    @Json(name = "topic_id")
    val topicId: Any?, // null
    @Json(name = "type")
    val type: String?, // image/gif
    @Json(name = "ups")
    val ups: Int?, // 2619
    @Json(name = "views")
    val views: Int?, // 43143
    @Json(name = "vote")
    val vote: Any?, // null
    @Json(name = "width")
    val width: Int? // 728
)