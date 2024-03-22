package com.example.searchfilmsapp.domain.api

import com.example.searchfilmsapp.domain.models.Movie
import com.example.searchfilmsapp.ui.movies.SearchMoviesCallback

interface MoviesInteractor {
    fun searchMovies(expression: String, consumer: MoviesConsumer)

    interface MoviesConsumer {
        fun consume(foundMovies: List<Movie>)
    }
}