package com.example.mobileapps.data.remote

class RemoteRepository(private val apiService: ApiService) {
    suspend fun getMusic() = apiService.getMusic("eminem")
}