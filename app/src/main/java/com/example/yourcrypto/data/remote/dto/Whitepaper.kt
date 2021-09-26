package com.example.yourcrypto.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Whitepaper(
    @SerializedName("link")
    val link: String = "",
    @SerializedName("thumbnail")
    val thumbnail: String = ""
)