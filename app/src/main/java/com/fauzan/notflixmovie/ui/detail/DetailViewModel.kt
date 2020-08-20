package com.fauzan.notflixmovie.ui.detail

import androidx.lifecycle.ViewModel
import com.fauzan.notflixmovie.model.Movies
import com.fauzan.notflixmovie.utils.DataItem

class DetailViewModel: ViewModel() {

    private lateinit var movieId: String
    private lateinit var tvShowId: String

    fun setSelectedMovie(id: String) {
        this.movieId = id
        this.tvShowId = id
    }

    fun getMovie(): Movies {
        lateinit var movie: Movies

        val movieEntities = DataItem.generateMovie()
        for(movieEntity in movieEntities) {
            if (movieEntity.id == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }

    fun getTvShow(): Movies {
        lateinit var tvShow: Movies

        val tvShowEntities = DataItem.generateTvShow()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity.id == tvShowId) {
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }
}