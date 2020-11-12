package com.example.weatherapp.api.currentLocation;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GeoPosition {

    @SerializedName("Latitude")
    @Expose
    private Float latitude;
    @SerializedName("Longitude")
    @Expose
    private Float longitude;
    @SerializedName("Elevation")
    @Expose
    private Elevation elevation;


    public GeoPosition() {
    }


    public GeoPosition(Float latitude, Float longitude, Elevation elevation) {
        super();
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


}
