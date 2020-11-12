
package com.example.weatherapp.api.locations;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Elevation {

    public Elevation() {
    }

    public Elevation(Metric metric, Imperial imperial) {
        this.metric = metric;
        this.imperial = imperial;
    }

    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    public Imperial getImperial() {
        return imperial;
    }

    public void setImperial(Imperial imperial) {
        this.imperial = imperial;
    }

    @SerializedName("Metric")
    @Expose
    public Metric metric;
    @SerializedName("Imperial")
    @Expose
    public Imperial imperial;

}
