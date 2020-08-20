package com.fauzan.notflixmovie.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


fun ImageView.loadImage(link: String?, placeholder: Int, error: Int) {
    Glide.with(this.context)
        .load(link)
        .apply(
            RequestOptions.placeholderOf(placeholder)
                .error(error)
        )
        .into(this)
}