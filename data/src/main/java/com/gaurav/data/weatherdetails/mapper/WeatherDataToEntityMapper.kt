package com.gaurav.data.weatherdetails.mapper

import com.gaurav.core.base.Mapper
import com.gaurav.data.weatherdetails.models.Coordinates
import com.gaurav.data.weatherdetails.models.Weather
import com.gaurav.data.weatherdetails.models.WeatherData
import com.gaurav.data.weatherdetails.models.WeatherMetaData
import com.gaurav.domain.entities.WeatherDataEntity
import javax.inject.Inject

class WeatherDataToEntityMapper @Inject constructor() : Mapper<WeatherData, WeatherDataEntity> {
    override fun map(srcObject: WeatherData): WeatherDataEntity =
        with(srcObject){
            WeatherDataEntity(
                getCoordinates(coordinates),
                getWeatherList(weathers),
                getWeatherMetaData(weatherMetaData),
            )
        }

    private fun getWeatherList(weathers: List<Weather>) =
        weathers.map {
            getWeather(it)
        }

    private fun getWeather(it: Weather) =
        with(it){
            com.gaurav.domain.entities.Weather(
                id,
                main,
                description,
                icon
            )
        }

    private fun getCoordinates(coordinates: Coordinates) =
        with(coordinates){
            com.gaurav.domain.entities.Coordinates(lat, lng)
        }

    private fun getWeatherMetaData(weatherMetaData: WeatherMetaData) =
        with(weatherMetaData){
            com.gaurav.domain.entities.WeatherMetaData(
                temp,
                feelsLike,
                minTemp,
                maxTemp,
                pressure,
                humidity
            )
        }

}