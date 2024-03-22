package com.example.searchfilmsapp.domain.api

import com.example.searchfilmsapp.domain.models.Movie

interface MoviesRepository {
    fun searchMovies(expression: String): List<Movie>
}