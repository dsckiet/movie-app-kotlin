package com.example.usher.call

import com.example.usher.models.get_latest_movie.Latest
import com.example.usher.models.get_now_playing.NowPlaying
import com.example.usher.models.get_now_playing.Result
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesAPI {

    companion object {
        const val baseURL: String = "https://api.themoviedb.org"
        const val apiKey: String = "1878b3b064120b74b4d7cd8c9e155cdf"
        const val backdrop: String = "https://image.tmdb.org/t/p/w500"
        const val playingURL: String =
            "$baseURL/3/movie/now_playing?api_key=$apiKey&language=en-US&page=1"
    }

    @GET("/3/movie/latest")
    fun getLatest(
        @Query("api_key")
        api_key: String = apiKey,
        @Query("language")
        language: String = "en-US",
        @Query("page")
        page: Int = 1
    ): Response<Latest>

    @GET("/3/movie/now_playing")
    fun getNowPlaying(
        @Query("api_key")
        api_key: String = apiKey,
        @Query("language")
        language: String = "en-US",
        @Query("page")
        page: Int = 1
    ): Call<NowPlaying>

    @GET("/3/movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        api_key: String = apiKey,
        @Query("language")
        language: String = "en-US",
        @Query("page")
        page: Int = 1
    ): Response<Result>

    @GET("/3/movie/top_rated")
    suspend fun getTopRated(
        @Query("api_key")
        api_key: String = apiKey,
        @Query("language")
        language: String = "en-US",
        @Query("page")
        page: Int = 1
    ): Response<Result>

    @GET("/3/movie/upcoming")
    suspend fun getUpcoming(
        @Query("api_key")
        api_key: String = apiKey,
        @Query("language")
        language: String = "en-US",
        @Query("page")
        page: Int = 1
    ): Response<Result>
}