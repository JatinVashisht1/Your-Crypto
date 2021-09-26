package com.example.yourcrypto.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("contributors")
    val contributors: Int = 0,
    @SerializedName("followers")
    val followers: Int = 0,
    @SerializedName("stars")
    val stars: Int = 0,
    @SerializedName("subscribers")
    val subscribers: Int = 0
)