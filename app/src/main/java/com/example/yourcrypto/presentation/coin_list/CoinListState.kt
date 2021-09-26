package com.example.yourcrypto.presentation.coin_list

import com.example.yourcrypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = listOf(),
    val error: String = ""
)
