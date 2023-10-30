package com.gaurav.weatherforecastapp.mapper

import com.gaurav.core.base.Mapper
import com.gaurav.domain.entities.WeatherDataEntity
import com.gaurav.weatherforecastapp.viewstatemodels.WeatherViewData
import com.gaurav.weatherforecastapp.viewstatemodels.WeatherViewItem
import javax.inject.Inject

class WeatherEntityToViewItemMapper @Inject constructor() : Mapper<WeatherDataEntity, WeatherViewItem> {
    override fun map(srcObject: WeatherDataEntity): WeatherViewItem =
        with(srcObject){
            WeatherViewItem(
                getWeatherList(weathers),
            )
        }

    private fun getWeatherList(weathers: List<com.gaurav.domain.entities.Weather>) =
        weathers.map {
            getWeather(it)
        }

    private fun getWeather(it: com.gaurav.domain.entities.Weather) =
        with(it){
            WeatherViewData(
                id,
                main,
                description,
                icon
            )
        }
}