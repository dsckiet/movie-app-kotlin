package com.example.usher.models.get_now_playing


data class NowPlaying(
    val results: MutableList<Result>
    /*@Json(name = "dates")
    var dates: Dates = Dates(),
    @Json(name = "page")
    var page: Int = 0,
    @Json(name = "results")
    val results: MutableList<Result>,
    @Json(name = "total_pages")
    var totalPages: Int = 0,
    @Json(name = "total_results")
    var totalResults: Int = 0*/
)