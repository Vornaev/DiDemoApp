package com.viktor.innap.didemoapp.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.viktor.innap.didemoapp.di.MainRepository

class MainViewModel(private val repository: MainRepository) : ViewModel() {
    val loginUserResponse = MutableLiveData<String>()

    fun loginUser(username: String, password: String) {
        val result = repository.loginUser(username, password)
        loginUserResponse.postValue(result)
    }
}