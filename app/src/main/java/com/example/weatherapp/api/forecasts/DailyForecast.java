package com.example.weatherapp.api.forecasts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailyForecast {
    public DailyForecast() {
    }

    public DailyForecast(Headline headline, List<DailyForecasts> dailyForecasts) {
        this.headline = headline;
        this.dailyForecasts = dailyForecasts;
    }

    public Headline getHeadline() {
        return headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public List<DailyForecasts> getDailyForecasts() {
        return dailyForecasts;
    }

    public void setDailyForecasts(List<DailyForecasts> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

    @SerializedName("Headline")
    @Expose
    public Headline headline;
    @SerializedName("DailyForecasts")
    @Expose
    public List<DailyForecasts> dailyForecasts = null;
}
