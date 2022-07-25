package com.example.playseetest

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {
    private val data = MutableLiveData<AllData>();
    private val TAG = "MainViewModel"

    init {
        loadData()
    }

    fun loadData() {
        ApiService.apiService.getData().enqueue(object : Callback<AllData> {
            override fun onResponse(call: Call<AllData>, response: Response<AllData>) {
                data.postValue(response.body()!!)
            }

            override fun onFailure(call: Call<AllData>, t: Throwable) {

            }
        })
    }

    fun getData(): MutableLiveData<AllData> {
        return data
    }
}