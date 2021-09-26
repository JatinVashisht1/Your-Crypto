package com.example.yourcrypto.di

import com.example.yourcrypto.common.Constants
import com.example.yourcrypto.data.remote.CoinPaprikaApi
import com.example.yourcrypto.data.repository.CoinRepositoryImplementation
import com.example.yourcrypto.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providesPaprikaApi() : CoinPaprikaApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi) : CoinRepository{
        return CoinRepositoryImplementation(api)
    }
}