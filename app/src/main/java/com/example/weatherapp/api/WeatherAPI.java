package com.example.weatherapp.api;

import com.example.weatherapp.api.currentLocation.CurrentPosition;
import com.example.weatherapp.api.forecasts.DailyForecast;
import com.example.weatherapp.api.locations.SearchRepository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherAPI {

    @GET("locations/v1/cities/search")
    Call<List<SearchRepository>> getBySearch(@Query("apikey") String apiKey, @Query("q") String query);

    @GET("forecasts/v1/daily/1day/{locationKey}")
    Call<DailyForecast> getDailyForecasts(@Path("locationKey") String locationKey,@Query("apikey") String apiKey);

    @GET("locations/v1/cities/geoposition/search")
    Call<CurrentPosition> getCurrentLocation(@Query("apikey") String apiKey, @Query("q") String query);

}