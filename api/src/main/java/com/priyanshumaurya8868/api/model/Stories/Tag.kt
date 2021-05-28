package com.priyanshumaurya8868.api.model.Stories


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Tag(
    @Json(name = "accent")
    val accent: String?, // 4E5997
    @Json(name = "background_hash")
    val backgroundHash: String?, // uJSrScD
    @Json(name = "background_is_animated")
    val backgroundIsAnimated: Boolean?, // false
    @Json(name = "description")
    val description: String?,
    @Json(name = "description_annotations")
    val descriptionAnnotations: DescriptionAnnotations?,
    @Json(name = "display_name")
    val displayName: String?, // confession bear
    @Json(name = "followers")
    val followers: Int?, // 6512
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
    val name: String?, // confession_bear
    @Json(name = "thumbnail_hash")
    val thumbnailHash: Any?, // null
    @Json(name = "thumbnail_is_animated")
    val thumbnailIsAnimated: Boolean?, // false
    @Json(name = "total_items")
    val totalItems: Int? // 12632
)