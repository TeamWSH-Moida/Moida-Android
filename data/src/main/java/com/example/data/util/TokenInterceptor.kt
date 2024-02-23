package com.example.data.util

import okhttp3.Interceptor
import okhttp3.Response

class TokenInterceptor(
    // TODO: userDataStorage 
) : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val path = request.url.encodedPath

        val ignorePath = listOf(
            "",
        )

        // TODO: accessExpireAt 
        // TODO: accessToken

        if(ignorePath.contains(path)) {
            return chain.proceed(request)
        }
        
        return chain.proceed(
            request
                .newBuilder()
                .header("Authorization", "Bearer (accessToken)")
                .build(),
        )
    }
}
