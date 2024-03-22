package com.example.searchfilmsapp.domain.models

import android.util.Log
import com.example.searchfilmsapp.data.MoviesRepositoryImpl
import com.example.searchfilmsapp.data.NetworkClient
import com.example.searchfilmsapp.data.network.RetrofitNetworkClient
import com.example.searchfilmsapp.domain.api.MoviesRepository

data class Movie(val id: String,
                 val resultType: String,
                 val image: String,
                 val title: String,
                 val description: String)
