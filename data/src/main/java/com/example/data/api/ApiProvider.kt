package com.example.data.api

import com.example.data.util.TokenInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiProvider {

    private val retrofit: Retrofit? = null

    private fun getLoggingInterceptor() = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BASIC)

    private fun getRetrofit(
        tokenInterceptor: TokenInterceptor,
    ) : Retrofit {
        return retrofit ?: Retrofit.Builder()
            .baseUrl("")
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(tokenInterceptor)
                    .addInterceptor(getLoggingInterceptor())
                    .build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // TODO: API
}
