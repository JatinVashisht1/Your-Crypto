package com.example.yourcrypto.domain.use_cases.get_coin

import com.example.yourcrypto.common.Resource
import com.example.yourcrypto.data.remote.dto.toCoin
import com.example.yourcrypto.data.remote.dto.toCoinDetail
import com.example.yourcrypto.domain.model.Coin
import com.example.yourcrypto.domain.model.CoinDetail
import com.example.yourcrypto.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String) : Flow<Resource<CoinDetail>> = flow{
        try{
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        }
        catch (e: HttpException){
            emit(Resource.Error<CoinDetail>(message = e.localizedMessage ?: "An unexpected error occurred"))
        }
        catch(e: IOException){
            emit(Resource.Error<CoinDetail>(message = "couldn't read server. Check your internet connection"))
        }
        catch(e: Exception){
            emit(Resource.Error<CoinDetail>(message = "An unexpected error occurred"))
        }
    }
}