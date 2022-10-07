package com.apik.httppract.`interface`

import com.apik.httppract.Model.Movie
import retrofit2.Call
import retrofit2.http.*

interface RetrofitServices {
    @GET("marvel")
    fun getMoviesList(): Call<MutableList<Movie>>
}