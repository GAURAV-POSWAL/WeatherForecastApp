package com.gaurav.data.weatherdetails.repositories

import com.gaurav.data.weatherdetails.services.WeatherDetailsApiService
import com.gaurav.domain.repositories.WeatherDetailsRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class WeatherDetailsRepositoryImpl @Inject constructor(
    private val apiService: WeatherDetailsApiService
): WeatherDetailsRepository {
    override fun fetchWeatherDetails() {
        CoroutineScope(Dispatchers.IO).launch{
            apiService.getCurrentWeatherData()
        }
    }
}