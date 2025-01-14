package campus.tech.kakao.map.model

import com.google.gson.annotations.SerializedName

data class SearchFromKeywordResponse(
    val documents: List<LocationDto>,
    val meta: CountDto
)
data class LocationDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("place_name")
    val title: String,
    @SerializedName("category_group_name")
    val category: String,
    @SerializedName("address_name")
    val address: String,
    @SerializedName("x")
    val x: String,
    @SerializedName("y")
    val y: String
)

data class CountDto (
    @SerializedName("total_count")
    val totalCount: Int,
    @SerializedName("pageable_count")
    val pageableCount: Int,
    @SerializedName("is_end")
    val isEnd: Boolean
)

