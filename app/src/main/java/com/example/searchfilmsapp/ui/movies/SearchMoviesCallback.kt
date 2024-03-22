package com.example.searchfilmsapp.ui.movies

import com.example.searchfilmsapp.domain.models.Movie

interface SearchMoviesCallback {
    fun onMoviesFound(moviesList: List<Movie>)
    fun onFailure(error: String)
}