package com.example.mobileapps.di

import androidx.room.Room
import com.example.mobileapps.data.local.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val roomModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java, "db").build()
    }
}