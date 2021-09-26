package com.example.yourcrypto.presentation.coin_detail

import com.example.yourcrypto.domain.model.Coin
import com.example.yourcrypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
