package com.example.mobileapps.data.remote

import com.example.mobileapps.data.remote.response.MusicResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    // @Headers("X-RapidAPI-Key: e9332e2617msh05a4e2c43cbe66dp139907jsneb5903628b11, "+"X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    suspend fun getMusic(
        @Query("q")query: String
    ): Response<MusicResponse>
}