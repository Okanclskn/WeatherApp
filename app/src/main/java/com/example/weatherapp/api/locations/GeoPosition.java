
package com.example.weatherapp.api.locations;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoPosition {
    public GeoPosition() {
    }

    public GeoPosition(Float latitude, Float longitude, Elevation elevation) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Elevation getElevation() {
        return elevation;
    }

    public void setElevation(Elevation elevation) {
        this.elevation = elevation;
    }

    @SerializedName("Latitude")
    @Expose
    public Float latitude;
    @SerializedName("Longitude")
    @Expose
    public Float longitude;
    @SerializedName("Elevation")
    @Expose
    public Elevation elevation;

}
