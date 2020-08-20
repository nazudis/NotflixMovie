package com.fauzan.notflixmovie.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fauzan.notflixmovie.R
import com.fauzan.notflixmovie.model.Movies
import com.fauzan.notflixmovie.ui.detail.DetailActivity
import com.fauzan.notflixmovie.utils.loadImage
import kotlinx.android.synthetic.main.item_movies.view.*

class MoviesAdapter: RecyclerView.Adapter<MoviesAdapter.MoviesHolder>() {

    private val listMovies = ArrayList<Movies>()

    fun setMovies(movie: List<Movies>?) {
        if (movie == null) return
        listMovies.clear()
        listMovies.addAll(movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movies, parent, false)
        return MoviesHolder(view)
    }

    override fun getItemCount(): Int = listMovies.size

    override fun onBindViewHolder(holder: MoviesHolder, position: Int) {
        val movie = listMovies[position]

        holder.bind(movie)
    }

    class MoviesHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(movie: Movies){
            with(itemView) {
                tv_item_title.text = movie.title
                tv_item_genre.text = movie.genre
                tv_item_rating.text = movie.rating
                tv_item_country.text = movie.country
                tv_item_description.text = movie.description
                tv_item_stars.text = movie.stars

                image_poster.loadImage(movie.image, R.drawable.ic_loading, R.drawable.ic_error)

                setOnClickListener {
                    val intent = Intent(context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_TITLE, movie.id)
                        putExtra(DetailActivity.EXTRA_CODE, DetailActivity.EXTRA_MOVIE)
                    }
                    context.startActivity(intent)
                }
            }
        }
    }
}