package com.gaurav.data.weatherdetails.di

import com.gaurav.data.weatherdetails.repositories.WeatherDetailsRepositoryImpl
import com.gaurav.data.weatherdetails.services.WeatherDetailsApiService
import com.gaurav.domain.repositories.WeatherDetailsRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit

@InstallIn(ViewModelComponent::class)
@Module
abstract class WeatherDetailsDataModule {
    @Binds
    abstract fun provideWeatherDetailsRepository(weatherDataRepo: WeatherDetailsRepositoryImpl): WeatherDetailsRepository

    @Provides
    fun provideWeatherDetailsApiService(retrofit: Retrofit): WeatherDetailsApiService{
        return retrofit.create(WeatherDetailsApiService::class.java)
    }


}