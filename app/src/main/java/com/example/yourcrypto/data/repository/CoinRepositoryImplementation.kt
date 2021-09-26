package com.example.yourcrypto.data.repository

import com.example.yourcrypto.data.remote.CoinPaprikaApi
import com.example.yourcrypto.data.remote.dto.CoinDetailDto
import com.example.yourcrypto.data.remote.dto.CoinDto
import com.example.yourcrypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImplementation @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}