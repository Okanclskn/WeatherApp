package com.example.weatherapp.api.forecasts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Headline {
    @SerializedName("EffectiveDate")
    @Expose
    public String effectiveDate;
    @SerializedName("EffectiveEpochDate")
    @Expose
    public Integer effectiveEpochDate;
    @SerializedName("Severity")
    @Expose
    public Integer severity;
    @SerializedName("Text")
    @Expose
    public String text;
    @SerializedName("Category")
    @Expose
    public String category;
    @SerializedName("EndDate")
    @Expose
    public String endDate;
    @SerializedName("EndEpochDate")
    @Expose
    public Integer endEpochDate;
    @SerializedName("MobileLink")
    @Expose
    public String mobileLink;
    @SerializedName("Link")
    @Expose
    public String link;
}
