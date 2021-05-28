package com.priyanshumaurya8868.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Tag(
    @Json(name = "accent")
    val accent: String?, // 027B89
    @Json(name = "background_hash")
    val backgroundHash: String?, // 1fDftsZ
    @Json(name = "background_is_animated")
    val backgroundIsAnimated: Boolean?, // false
    @Json(name = "description")
    val description: String?, // Heroes on paper
    @Json(name = "display_name")
    val displayName: String?, // comic
    @Json(name = "followers")
    val followers: Int?, // 76900
    @Json(name = "following")
    val following: Boolean?, // false
    @Json(name = "is_promoted")
    val isPromoted: Boolean?, // false
    @Json(name = "is_whitelisted")
    val isWhitelisted: Boolean?, // false
    @Json(name = "logo_destination_url")
    val logoDestinationUrl: Any?, // null
    @Json(name = "logo_hash")
    val logoHash: Any?, // null
    @Json(name = "name")
    val name: String?, // comic
    @Json(name = "thumbnail_hash")
    val thumbnailHash: Any?, // null
    @Json(name = "thumbnail_is_animated")
    val thumbnailIsAnimated: Boolean?, // false
    @Json(name = "total_items")
    val totalItems: Int? // 56831
)