package com.gaurav.data.weatherdetails.models

import com.google.gson.annotations.SerializedName

data class WeatherData(
    @SerializedName("coord")
    val coordinates: Coordinates = Coordinates(),
    @SerializedName("weather")
    val weathers: List<Weather> = emptyList(),
    @SerializedName("base")
    val base: String = "",
    @SerializedName("main")
    val weatherMetaData: WeatherMetaData,
    @SerializedName("visibility")
    val visibility:Int = -1,
)


data class WeatherMetaData(
    val temp: Float = 0f,
    @SerializedName("feels_like")
    val feelsLike: Float = 0f,
    @SerializedName("temp_min")
    val minTemp: Float = 0f,
    @SerializedName("temp_max")
    val maxTemp: Float = 0f,
    @SerializedName("pressure")
    val pressure: Float = 0f,
    @SerializedName("humidity")
    val humidity: Float = 0f,
)

data class Weather(
    @SerializedName("id")
    val id: Int = -1,
    @SerializedName("main")
    val main: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("icon")
    val icon: String = ""
)

data class Coordinates(
    @SerializedName("lat")
    val lat: Float = 0.0f,
    @SerializedName("lng")
    val lng: Float = 0.0f)
