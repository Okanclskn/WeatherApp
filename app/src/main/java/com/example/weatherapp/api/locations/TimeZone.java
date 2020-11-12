
package com.example.weatherapp.api.locations;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeZone {

    public TimeZone() {
    }

    public TimeZone(String code, String name, Float gmtOffset, Boolean isDaylightSaving, Object nextOffsetChange) {
        this.code = code;
        this.name = name;
        this.gmtOffset = gmtOffset;
        this.isDaylightSaving = isDaylightSaving;
        this.nextOffsetChange = nextOffsetChange;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(Float gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public Boolean getDaylightSaving() {
        return isDaylightSaving;
    }

    public void setDaylightSaving(Boolean daylightSaving) {
        isDaylightSaving = daylightSaving;
    }

    public Object getNextOffsetChange() {
        return nextOffsetChange;
    }

    public void setNextOffsetChange(Object nextOffsetChange) {
        this.nextOffsetChange = nextOffsetChange;
    }

    @SerializedName("Code")
    @Expose
    public String code;
    @SerializedName("Name")
    @Expose
    public String name;
    @SerializedName("GmtOffset")
    @Expose
    public Float gmtOffset;
    @SerializedName("IsDaylightSaving")
    @Expose
    public Boolean isDaylightSaving;
    @SerializedName("NextOffsetChange")
    @Expose
    public Object nextOffsetChange;

}
