package com.example.weatherapp.api.locations;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParentCity {

    public ParentCity() {
    }

    public ParentCity(String key, String localizedName, String englishName) {
        this.key = key;
        this.localizedName = localizedName;
        this.englishName = englishName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    @SerializedName("Key")
    @Expose
    public String key;
    @SerializedName("LocalizedName")
    @Expose
    public String localizedName;
    @SerializedName("EnglishName")
    @Expose
    public String englishName;

}
