package com.example.yourcrypto.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("coin_counter")
    val coinCounter: Int = 0,
    @SerializedName("ico_counter")
    val icoCounter: Int = 0,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = ""
)