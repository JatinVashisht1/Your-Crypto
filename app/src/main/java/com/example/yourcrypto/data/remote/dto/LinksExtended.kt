package com.example.yourcrypto.data.remote.dto


import com.google.gson.annotations.SerializedName

data class LinksExtended(
    @SerializedName("stats")
    val stats: Stats = Stats(),
    @SerializedName("type")
    val type: String = "",
    @SerializedName("url")
    val url: String = ""
)