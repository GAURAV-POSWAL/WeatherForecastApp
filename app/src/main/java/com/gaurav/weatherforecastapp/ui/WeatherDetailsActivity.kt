package com.gaurav.weatherforecastapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.gaurav.weatherforecastapp.R
import com.gaurav.weatherforecastapp.viewModels.WeatherDetailsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WeatherDetailsActivity : AppCompatActivity() {

    private lateinit var weatherDetailsViewModel: WeatherDetailsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weatherDetailsViewModel = ViewModelProvider(this)[WeatherDetailsViewModel::class.java]
        setObservers()
        weatherDetailsViewModel.getWeatherDetails()

    }

    private fun setObservers() {
        lifecycleScope.launch(Dispatchers.Main) {
            weatherDetailsViewModel.weatherState.collectLatest {
                Log.i("WeatherDetailsActivity", "size of list is: ${it.weathers.size}")
            }
        }
    }
}