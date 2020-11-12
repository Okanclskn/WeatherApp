
package com.example.weatherapp.api.locations;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SupplementalAdminArea {

    public SupplementalAdminArea() {
    }

    public SupplementalAdminArea(Integer level, String localizedName, String englishName) {
        this.level = level;
        this.localizedName = localizedName;
        this.englishName = englishName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    @SerializedName("Level")
    @Expose
    public Integer level;
    @SerializedName("LocalizedName")
    @Expose
    public String localizedName;
    @SerializedName("EnglishName")
    @Expose
    public String englishName;

}
