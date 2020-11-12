package com.example.weatherapp.api.forecasts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DailyForecasts {
    public DailyForecasts() {
    }

    public DailyForecasts(String date, Integer epochDate, Temperature temperature, Day day, Night night) {
        this.date = date;
        this.epochDate = epochDate;
        this.temperature = temperature;
        this.day = day;
        this.night = night;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getEpochDate() {
        return epochDate;
    }

    public void setEpochDate(Integer epochDate) {
        this.epochDate = epochDate;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Night getNight() {
        return night;
    }

    public void setNight(Night night) {
        this.night = night;
    }

    @SerializedName("Date")
    @Expose
    public String date;
    @SerializedName("EpochDate")
    @Expose
    public Integer epochDate;
    @SerializedName("Temperature")
    @Expose
    public Temperature temperature;
    @SerializedName("Day")
    @Expose
    public Day day;
    @SerializedName("Night")
    @Expose
    public Night night;
}
