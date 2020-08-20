package com.fauzan.notflixmovie.ui.detail

import com.fauzan.notflixmovie.utils.DataItem
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val movie = DataItem.generateMovie()[0]
    private val tvShow = DataItem.generateTvShow()[0]
    private val movieId = movie.id
    private val tvShowId = tvShow.id

    @Before
    fun setUp(){
        viewModel = DetailViewModel()
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(movieId)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(movie.id, movieEntity.id)
        assertEquals(movie.title, movieEntity.title)
        assertEquals(movie.genre, movieEntity.genre)
        assertEquals(movie.rating, movieEntity.rating)
        assertEquals(movie.country, movieEntity.country)
        assertEquals(movie.description, movieEntity.description)
        assertEquals(movie.creators, movieEntity.creators)
        assertEquals(movie.taglines, movieEntity.taglines)
        assertEquals(movie.stars, movieEntity.stars)
        assertEquals(movie.image, movieEntity.image)
        assertEquals(movie.thumbnail, movieEntity.thumbnail)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedMovie(tvShowId)
        val tvShowEntity = viewModel.getTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(tvShow.id, tvShowEntity.id)
        assertEquals(tvShow.title, tvShowEntity.title)
        assertEquals(tvShow.genre, tvShowEntity.genre)
        assertEquals(tvShow.rating, tvShowEntity.rating)
        assertEquals(tvShow.country, tvShowEntity.country)
        assertEquals(tvShow.description, tvShowEntity.description)
        assertEquals(tvShow.creators, tvShowEntity.creators)
        assertEquals(tvShow.taglines, tvShowEntity.taglines)
        assertEquals(tvShow.stars, tvShowEntity.stars)
        assertEquals(tvShow.image, tvShowEntity.image)
        assertEquals(tvShow.thumbnail, tvShowEntity.thumbnail)
    }
}