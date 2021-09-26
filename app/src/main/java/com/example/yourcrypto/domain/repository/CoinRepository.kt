package com.example.yourcrypto.domain.repository

import com.example.yourcrypto.data.remote.dto.CoinDetailDto
import com.example.yourcrypto.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId: String) : CoinDetailDto
}