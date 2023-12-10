package com.example.mobileapps

import com.example.mobileapps.data.local.LocalRepository
import com.example.mobileapps.data.local.UserEntity
import com.example.mobileapps.data.remote.RemoteRepository

class Repository(private val localRepository: LocalRepository, private val remoteRepository: RemoteRepository) {
    suspend fun insertUser(user: UserEntity){
        localRepository.insertUser(user)
    }
    suspend fun getUser(email: String, password: String): UserEntity{
        return localRepository.getUser(email, password)
    }
    suspend fun getMusic() = remoteRepository.getMusic()
}