package com.br.matchmovies.model

data class Movie (val title: String, val overview: String, val rating: Float, val genres: String,
                  val cast: String, val director: String, val time: Int, val year: Int, val imageMovie: Int) {
}