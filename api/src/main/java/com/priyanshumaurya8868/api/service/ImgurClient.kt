package com.priyanshumaurya8868.api.service

import com.priyanshumaurya8868.api.converter.EnumConverterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ImgurClient {

    private const val API_KEY = ""//TODO: this should ideally in the app not in lib
    private val okHttpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor {
                val req = it.request().newBuilder()
                    .addHeader("Authorization", "Client-ID $API_KEY")
                    .build()
                it.proceed(req)
            }.build()
    }

    private val retrofitBuilder: Retrofit by lazy {
        Retrofit.Builder().client(okHttpClient)
            .baseUrl("https://api.imgur.com/3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .addConverterFactory(EnumConverterFactory())
            .build()
    }

    val api: ImgurApi by lazy { retrofitBuilder.create(ImgurApi::class.java) }

}