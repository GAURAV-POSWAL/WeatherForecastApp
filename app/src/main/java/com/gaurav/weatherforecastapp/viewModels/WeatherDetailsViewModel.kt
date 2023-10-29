package com.gaurav.weatherforecastapp.viewModels

import androidx.lifecycle.ViewModel
import com.gaurav.domain.interactors.GetWeatherDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherDetailsViewModel @Inject constructor(
    private val getWeatherDetailsUseCase: GetWeatherDetailsUseCase
): ViewModel() {
    fun getWeatherDetails(){
        getWeatherDetailsUseCase.getWeatherDetails()
    }
}