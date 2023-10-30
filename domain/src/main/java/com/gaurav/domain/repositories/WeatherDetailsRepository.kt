package com.gaurav.domain.repositories

import com.gaurav.domain.entities.WeatherDataEntity
import kotlinx.coroutines.flow.Flow

interface WeatherDetailsRepository {
    suspend fun fetchWeatherDetails(): Flow<WeatherDataEntity>
}