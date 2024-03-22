package com.example.searchfilmsapp.domain.models

import android.util.Log
import com.example.searchfilmsapp.creator.Creator
import com.example.searchfilmsapp.domain.api.MoviesInteractor

class Coll() : MoviesInteractor.MoviesConsumer{
    var list : List<Movie> = ArrayList<Movie>()
    override fun consume(foundMovies: List<Movie>) {
        this.list = foundMovies as ArrayList<Movie>
        Log.e("collection","in consume:$list")
    }

    fun getMovies(): List<Movie> {
        return this.list
    }
}