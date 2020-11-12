package com.example.weatherapp.api.forecasts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Maximum {
    public Maximum() {
    }

    public Maximum(Integer value, String unit, Integer unitType) {
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    @SerializedName("Value")
    @Expose
    public Integer value;
    @SerializedName("Unit")
    @Expose
    public String unit;
    @SerializedName("UnitType")
    @Expose
    public Integer unitType;

}
