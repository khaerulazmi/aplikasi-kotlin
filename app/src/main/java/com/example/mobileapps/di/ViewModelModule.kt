package com.example.mobileapps.di

import com.example.mobileapps.ui.home.HomeViewModel
import com.example.mobileapps.ui.login.LoginViewModel
import com.example.mobileapps.ui.register.RegisterViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { LoginViewModel(get()) }
    single { RegisterViewModel(get()) }
    single { HomeViewModel(get()) }
}