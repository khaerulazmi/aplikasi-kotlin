package com.example.mobileapps.di

import com.example.mobileapps.Repository
import com.example.mobileapps.data.local.LocalRepository
import com.example.mobileapps.data.remote.RemoteRepository
import org.koin.dsl.module

val repositoryModule = module{
    single { LocalRepository(get()) }
    single { RemoteRepository(get()) }
    single { Repository(get(), get()) }
}