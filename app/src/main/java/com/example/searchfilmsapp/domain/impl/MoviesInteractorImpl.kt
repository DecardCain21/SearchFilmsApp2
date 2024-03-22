package com.example.searchfilmsapp.domain.impl

import com.example.searchfilmsapp.domain.api.MoviesInteractor
import com.example.searchfilmsapp.domain.api.MoviesRepository
import com.example.searchfilmsapp.ui.movies.SearchMoviesCallback
import java.util.concurrent.Executors

class MoviesInteractorImpl(private val repository: MoviesRepository) : MoviesInteractor {

    private val executor = Executors.newCachedThreadPool()

    override fun searchMovies(expression: String, consumer: MoviesInteractor.MoviesConsumer) {
        executor.execute {
            consumer.consume(repository.searchMovies(expression))
        }
    }
}

/*
class MoviesInteractorImpl(private val repository: MoviesRepository) : MoviesInteractor {

    override fun searchMovies(expression: String, consumer: MoviesInteractor.MoviesConsumer) {
        val t = Thread {
            consumer.consume(repository.searchMovies(expression))
        }
        t.start()
    }
}*/
