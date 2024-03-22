package com.example.searchfilmsapp.creator

import com.example.searchfilmsapp.data.MoviesRepositoryImpl
import com.example.searchfilmsapp.data.network.RetrofitNetworkClient
import com.example.searchfilmsapp.domain.api.MoviesInteractor
import com.example.searchfilmsapp.domain.api.MoviesRepository
import com.example.searchfilmsapp.domain.impl.MoviesInteractorImpl

object Creator {
    private fun getMoviesRepository(): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient())
    }

    fun provideMoviesInteractor(): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository())
    }
}