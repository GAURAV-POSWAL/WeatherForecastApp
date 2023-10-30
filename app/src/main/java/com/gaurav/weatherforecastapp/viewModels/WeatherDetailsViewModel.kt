package com.gaurav.weatherforecastapp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gaurav.domain.interactors.GetWeatherDetailsUseCase
import com.gaurav.weatherforecastapp.mapper.WeatherEntityToViewItemMapper
import com.gaurav.weatherforecastapp.viewstatemodels.WeatherViewItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherDetailsViewModel @Inject constructor(
    private val getWeatherDetailsUseCase: GetWeatherDetailsUseCase,
    private val  mapper: WeatherEntityToViewItemMapper
): ViewModel() {

    private val _weatherState: MutableSharedFlow<WeatherViewItem> = MutableSharedFlow()
    val weatherState = _weatherState.asSharedFlow()

    fun getWeatherDetails() {
        viewModelScope.launch(Dispatchers.IO) {
            getWeatherDetailsUseCase.getWeatherDetails().collect{
                _weatherState.emit(mapper.map(it))
            }
        }
    }
}