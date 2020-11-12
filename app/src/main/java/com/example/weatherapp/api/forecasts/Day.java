package com.example.weatherapp.api.forecasts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Day {
    @SerializedName("Icon")
    @Expose
    public Integer icon;
    @SerializedName("IconPhrase")
    @Expose
    public String iconPhrase;
    @SerializedName("HasPrecipitation")
    @Expose
    public Boolean hasPrecipitation;
}
