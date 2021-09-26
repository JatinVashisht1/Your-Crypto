package com.example.yourcrypto.data.remote.dto


import com.example.yourcrypto.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName

data class CoinDetailDto(
    @SerializedName("description")
    val description: String = "",
    @SerializedName("development_status")
    val developmentStatus: String = "",
    @SerializedName("first_data_at")
    val firstDataAt: String = "",
    @SerializedName("hardware_wallet")
    val hardwareWallet: Boolean = false,
    @SerializedName("hash_algorithm")
    val hashAlgorithm: String = "",
    @SerializedName("id")
    val id: String = "",
    @SerializedName("is_active")
    val isActive: Boolean = false,
    @SerializedName("is_new")
    val isNew: Boolean = false,
    @SerializedName("last_data_at")
    val lastDataAt: String = "",
    @SerializedName("links")
    val links: Links = Links(),
    @SerializedName("links_extended")
    val linksExtended: List<LinksExtended> = listOf(),
    @SerializedName("message")
    val message: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("open_source")
    val openSource: Boolean = false,
    @SerializedName("org_structure")
    val orgStructure: String = "",
    @SerializedName("proof_type")
    val proofType: String = "",
    @SerializedName("rank")
    val rank: Int = 0,
    @SerializedName("started_at")
    val startedAt: String = "",
    @SerializedName("symbol")
    val symbol: String = "",
    @SerializedName("tags")
    val tags: List<Tag> = listOf(),
    @SerializedName("team")
    val team: List<TeamMember> = listOf(),
    @SerializedName("type")
    val type: String = "",
    @SerializedName("whitepaper")
    val whitepaper: Whitepaper = Whitepaper()
)

fun CoinDetailDto.toCoinDetail() : CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        rank = rank,
        isActive = isActive,
        tags = tags.map{ it.name },
        team = team,
        symbol = symbol
    )
}