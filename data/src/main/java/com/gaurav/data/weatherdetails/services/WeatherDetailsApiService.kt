package com.gaurav.data.weatherdetails.services

import com.gaurav.data.weatherdetails.models.WeatherData
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherDetailsApiService {

    @GET("weather")
    suspend fun getCurrentWeatherData(
        @Query("q") city: String = "Bengaluru",
        @Query("APPID") appId: String = "9b8cb8c7f11c077f8c4e217974d9ee40"
    ): WeatherData
}