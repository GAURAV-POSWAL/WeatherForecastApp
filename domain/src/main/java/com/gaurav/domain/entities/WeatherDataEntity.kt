package com.gaurav.domain.entities

data class WeatherDataEntity(
    val coordinates: Coordinates = Coordinates(),
    val weathers: List<Weather> = emptyList(),
    val weatherMetaData: WeatherMetaData,
)


data class Coordinates(
    val lat: Float = 0.0f,
    val lng: Float = 0.0f)


data class Weather(
    val id: Int = -1,
    val main: String = "",
    val description: String = "",
    val icon: String = ""
)

data class WeatherMetaData(
    val temp: Float = 0f,
    val feelsLike: Float = 0f,
    val minTemp: Float = 0f,
    val maxTemp: Float = 0f,
    val pressure: Float = 0f,
    val humidity: Float = 0f,
)