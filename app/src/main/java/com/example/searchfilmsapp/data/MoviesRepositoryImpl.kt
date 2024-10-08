package com.example.searchfilmsapp.data

import com.example.searchfilmsapp.data.dto.MoviesSearchRequest
import com.example.searchfilmsapp.data.dto.MoviesSearchResponse
import com.example.searchfilmsapp.domain.api.MoviesRepository
import com.example.searchfilmsapp.domain.models.Movie

class MoviesRepositoryImpl(private val networkClient: NetworkClient) : MoviesRepository {

    override fun searchMovies(expression: String): List<Movie> {
        val response = networkClient.doRequest(MoviesSearchRequest(expression))
        if (response.resultCode == 200) {
            return (response as MoviesSearchResponse).results.map {
                Movie(it.id, it.resultType, it.image, it.title, it.description) }
        } else {
            return emptyList()
        }
    }
}