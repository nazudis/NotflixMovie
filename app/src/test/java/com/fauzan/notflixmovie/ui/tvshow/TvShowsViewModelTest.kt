package com.fauzan.notflixmovie.ui.tvshow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowsViewModelTest {

    private lateinit var viewModel: TvShowsViewModel

    @Before
    fun setUp(){
        viewModel = TvShowsViewModel()
    }

    @Test
    fun getTvShows() {

        val tvShowEntities = viewModel.getTvShows()
        assertNotNull(tvShowEntities)
        assertEquals(10, tvShowEntities.size)
    }
}