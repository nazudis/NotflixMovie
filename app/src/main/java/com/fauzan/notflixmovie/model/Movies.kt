package com.fauzan.notflixmovie.model

data class Movies(
    var id: String? = "",
    var title : String? = "",
    var genre : String? = "",
    var rating : String? = "",
    var country: String? = "",
    var description : String? = "",
    var creators : String? = "",
    var taglines : String? = "",
    var stars : String? = "",
    var image : String? = "",
    var thumbnail : String? = ""
)