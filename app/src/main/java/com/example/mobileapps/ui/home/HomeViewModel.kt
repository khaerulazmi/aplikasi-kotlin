package com.example.mobileapps.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobileapps.Repository
import com.example.mobileapps.data.remote.response.MusicResponse
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel(private val repository: Repository): ViewModel() {
    private val getMovie = MutableLiveData<Response<MusicResponse>>()
    val observeMovie: LiveData<Response<MusicResponse>> = getMovie

    fun getMovie(){
        viewModelScope.launch {
            try {
                val result = repository.getMusic()
                getMovie.postValue(result)
            } catch (e: Exception){
                e.printStackTrace()
            }
        }
    }
}