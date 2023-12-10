package com.example.mobileapps.di

import com.example.mobileapps.data.remote.ApiService
import com.example.mobileapps.util.constant.BASE_URL
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single {
        OkHttpClient.Builder()
            .connectTimeout(60L, TimeUnit.SECONDS)
            .readTimeout(60L, TimeUnit.SECONDS)
            .writeTimeout(60L, TimeUnit.SECONDS)
            .build()
    }
    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }
//    single {
//        Request.Builder()
//            .addHeader("X-RapidAPI-Key", "e9332e2617msh05a4e2c43cbe66dp139907jsneb5903628b11")
//            .addHeader("X-RapidAPI-Host", "deezerdevs-deezer.p.rapidapi.com")
//            .build()
//    }
    single {
        createApiService<ApiService>(get())
    }
}
inline fun <reified T>createApiService(retrofit: Retrofit):T = retrofit.create(T::class.java)