package com.fauzan.notflixmovie.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider
import com.fauzan.notflixmovie.R
import com.fauzan.notflixmovie.model.Movies
import com.fauzan.notflixmovie.utils.loadImage
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_CODE = "extra_code"
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TVSHOW = "extra_tvshow"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        if (supportActionBar != null) {
            title = null
            toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
            toolbar.setNavigationOnClickListener { finish() }
        }

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            when (extras.getString(EXTRA_CODE)){
                EXTRA_MOVIE -> {
                    val movieId = extras.getString(EXTRA_TITLE)
                    if (movieId != null) {
                        viewModel.setSelectedMovie(movieId)
                        populateMovie(viewModel.getMovie())
                    }
                }
                EXTRA_TVSHOW -> {
                    val tvShowId = extras.getString(EXTRA_TITLE)
                    if (tvShowId != null) {
                        viewModel.setSelectedMovie(tvShowId)
                        populateMovie(viewModel.getTvShow())
                    }
                }
            }
        }
    }

    private fun populateMovie(data: Movies) {

        tv_item_title.text = data.title
        tv_item_genre.text = data.genre
        tv_item_rating.text = data.rating
        tv_item_country.text = data.country
        tv_item_description.text = data.description
        tv_item_creators.text = data.creators
        tv_item_tagline.text = data.taglines
        tv_item_stars.text = data.stars

        image_poster.loadImage(data.image, R.drawable.ic_loading_thumb, R.drawable.ic_error_thumb)
        img_thumbnail.loadImage(data.thumbnail, R.drawable.ic_loading, R.drawable.ic_error)
    }
}