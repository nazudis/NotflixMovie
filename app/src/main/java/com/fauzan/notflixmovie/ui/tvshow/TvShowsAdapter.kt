package com.fauzan.notflixmovie.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fauzan.notflixmovie.R
import com.fauzan.notflixmovie.model.Movies
import com.fauzan.notflixmovie.ui.detail.DetailActivity
import com.fauzan.notflixmovie.utils.loadImage
import kotlinx.android.synthetic.main.item_tvshows.view.*

class TvShowsAdapter: RecyclerView.Adapter<TvShowsAdapter.TvShowHolder>() {

    private val listTvShow = ArrayList<Movies>()

    fun setTvShow(tvShow: List<Movies>?) {
        if (tvShow == null) return
        listTvShow.clear()
        listTvShow.addAll(tvShow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tvshows, parent, false)
        return TvShowHolder(view)
    }

    override fun getItemCount(): Int = listTvShow.size

    override fun onBindViewHolder(holder: TvShowHolder, position: Int) {
        val tvShow = listTvShow[position]

        holder.bind(tvShow)
    }

    class TvShowHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(tvShow: Movies) {
            with(itemView) {
                tv_item_title.text = tvShow.title
                tv_item_genre.text = tvShow.genre
                tv_item_rating.text = tvShow.rating
                tv_item_country.text = tvShow.country
                tv_item_description.text = tvShow.description
                tv_item_stars.text = tvShow.stars

                image_poster.loadImage(tvShow.image, R.drawable.ic_loading, R.drawable.ic_error)

                setOnClickListener {
                    val intent = Intent(context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_TITLE, tvShow.id)
                        putExtra(DetailActivity.EXTRA_CODE, DetailActivity.EXTRA_TVSHOW)
                    }
                    context.startActivity(intent)
                }
            }
        }
    }
}