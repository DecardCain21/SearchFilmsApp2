package com.example.searchfilmsapp.data.network

import com.example.searchfilmsapp.data.dto.MoviesSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApiService {
    @GET("/en/API/SearchMovie/k_zcuw1ytf/{expression}")
    fun findMovies(@Path("expression") expression: String): Call<MoviesSearchResponse>
}