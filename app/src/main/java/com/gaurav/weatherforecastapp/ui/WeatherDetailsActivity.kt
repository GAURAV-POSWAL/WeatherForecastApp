package com.gaurav.weatherforecastapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.gaurav.weatherforecastapp.R
import com.gaurav.weatherforecastapp.viewModels.WeatherDetailsViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class WeatherDetailsActivity : AppCompatActivity() {

    private lateinit var weatherDetailsViewModel: WeatherDetailsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weatherDetailsViewModel = ViewModelProvider(this)[WeatherDetailsViewModel::class.java]
        weatherDetailsViewModel.getWeatherDetails()
    }
}