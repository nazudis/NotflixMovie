package com.fauzan.notflixmovie.ui.movies

import androidx.lifecycle.ViewModel
import com.fauzan.notflixmovie.model.Movies
import com.fauzan.notflixmovie.utils.DataItem

class MoviesViewModel: ViewModel() {

    fun getMovies(): List<Movies> = DataItem.generateMovie()

}