package com.gaurav.data.weatherdetails.repositories

import com.gaurav.data.weatherdetails.mapper.WeatherDataToEntityMapper
import com.gaurav.data.weatherdetails.services.WeatherDetailsApiService
import com.gaurav.domain.entities.WeatherDataEntity
import com.gaurav.domain.repositories.WeatherDetailsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WeatherDetailsRepositoryImpl @Inject constructor(
    private val apiService: WeatherDetailsApiService,
    private val mapper: WeatherDataToEntityMapper
): WeatherDetailsRepository {
    override suspend fun fetchWeatherDetails(): Flow<WeatherDataEntity> = flow{
        val weatherData = apiService.getCurrentWeatherData()
        emit(mapper.map(weatherData))
    }
}