
package com.example.weatherapp.api.locations;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Region {
    public Region() {
    }

    public Region(String iD, String localizedName, String englishName) {
        this.iD = iD;
        this.localizedName = localizedName;
        this.englishName = englishName;
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

    @SerializedName("ID")
    @Expose
    public String iD;
    @SerializedName("LocalizedName")
    @Expose
    public String localizedName;
    @SerializedName("EnglishName")
    @Expose
    public String englishName;

}
