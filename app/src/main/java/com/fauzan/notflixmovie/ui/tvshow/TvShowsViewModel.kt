package com.fauzan.notflixmovie.ui.tvshow

import androidx.lifecycle.ViewModel
import com.fauzan.notflixmovie.model.Movies
import com.fauzan.notflixmovie.utils.DataItem

class TvShowsViewModel: ViewModel() {

    fun getTvShows(): List<Movies> = DataItem.generateTvShow()

}