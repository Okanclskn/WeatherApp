
package com.example.weatherapp.api.locations;

//dataservice.accuweather.com/locations/v1/search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdministrativeArea {
    public AdministrativeArea() {
    }

    public AdministrativeArea(String iD, String localizedName, String englishName, Integer level, String localizedType, String englishType, String countryID) {
        this.iD = iD;
        this.localizedName = localizedName;
        this.englishName = englishName;
        this.level = level;
        this.localizedType = localizedType;
        this.englishType = englishType;
        this.countryID = countryID;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLocalizedType() {
        return localizedType;
    }

    public void setLocalizedType(String localizedType) {
        this.localizedType = localizedType;
    }

    public String getEnglishType() {
        return englishType;
    }

    public void setEnglishType(String englishType) {
        this.englishType = englishType;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    @SerializedName("ID")
    @Expose
    public String iD;
    @SerializedName("LocalizedName")
    @Expose
    public String localizedName;
    @SerializedName("EnglishName")
    @Expose
    public String englishName;
    @SerializedName("Level")
    @Expose
    public Integer level;
    @SerializedName("LocalizedType")
    @Expose
    public String localizedType;
    @SerializedName("EnglishType")
    @Expose
    public String englishType;
    @SerializedName("CountryID")
    @Expose
    public String countryID;

}
