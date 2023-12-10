package com.example.mobileapps.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobileapps.Repository
import com.example.mobileapps.data.local.UserEntity
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: Repository): ViewModel() {
    private val isLogin = MutableLiveData<UserEntity>()
    fun observeIsLogin(): LiveData<UserEntity> = isLogin

    fun getDataLogin(email: String, password: String){
        viewModelScope.launch {
            when(val result = repository.getUser(email, password)){
                is UserEntity -> {
                    isLogin.postValue(result)
                }
            }
        }
    }
}