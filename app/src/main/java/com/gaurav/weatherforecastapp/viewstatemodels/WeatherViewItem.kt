package com.gaurav.weatherforecastapp.viewstatemodels

data class WeatherViewItem(val weathers: List<WeatherViewData> = emptyList())

data class WeatherViewData(
    val id: Int = -1,
    val main: String = "",
    val description: String = "",
    val icon: String = ""
)
