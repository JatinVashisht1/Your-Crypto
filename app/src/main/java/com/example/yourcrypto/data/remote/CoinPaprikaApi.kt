package com.example.yourcrypto.data.remote

import com.example.yourcrypto.data.remote.dto.CoinDetailDto
import com.example.yourcrypto.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path


interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String) : CoinDetailDto
}