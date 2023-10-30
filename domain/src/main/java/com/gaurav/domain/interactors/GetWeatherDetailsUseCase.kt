package com.gaurav.domain.interactors

import com.gaurav.domain.repositories.WeatherDetailsRepository
import javax.inject.Inject

class GetWeatherDetailsUseCase @Inject constructor (
    private val weatherDetailsRepository: WeatherDetailsRepository
) {
    suspend fun getWeatherDetails() = weatherDetailsRepository.fetchWeatherDetails()
}