package com.example.yourcrypto.domain.use_cases.get_coins

import com.example.yourcrypto.common.Resource
import com.example.yourcrypto.data.remote.dto.toCoin
import com.example.yourcrypto.domain.model.Coin
import com.example.yourcrypto.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke() : Flow<Resource<List<Coin>>> = flow{
        try{
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map{ it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        }
        catch (e: HttpException){
            emit(Resource.Error<List<Coin>>(message = e.localizedMessage ?: "An unexpected error occurred"))
        }
        catch(e: IOException){
            emit(Resource.Error<List<Coin>>(message = "couldn't read server. Check your internet connection"))
        }
        catch(e: Exception){
            emit(Resource.Error<List<Coin>>(message = "An unexpected error occurred"))
        }
    }
}