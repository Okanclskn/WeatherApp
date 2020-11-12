
package com.example.weatherapp.api.locations;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchRepository {
    public SearchRepository() {
    }

    public SearchRepository(Integer version, String key, String type, Integer rank, String localizedName, String englishName, String primaryPostalCode, Region region, Country country, AdministrativeArea administrativeArea, TimeZone timeZone, GeoPosition geoPosition, Boolean isAlias, ParentCity parentCity, List<SupplementalAdminArea> supplementalAdminAreas, List<String> dataSets) {
        this.version = version;
        this.key = key;
        this.type = type;
        this.rank = rank;
        this.localizedName = localizedName;
        this.englishName = englishName;
        this.primaryPostalCode = primaryPostalCode;
        this.region = region;
        this.country = country;
        this.administrativeArea = administrativeArea;
        this.timeZone = timeZone;
        this.geoPosition = geoPosition;
        this.isAlias = isAlias;
        this.parentCity = parentCity;
        this.supplementalAdminAreas = supplementalAdminAreas;
        this.dataSets = dataSets;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getKey() {
        return key;
    }



    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
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

    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    public void setPrimaryPostalCode(String primaryPostalCode) {
        this.primaryPostalCode = primaryPostalCode;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    public Boolean getAlias() {
        return isAlias;
    }

    public void setAlias(Boolean alias) {
        isAlias = alias;
    }

    public ParentCity getParentCity() {
        return parentCity;
    }

    public void setParentCity(ParentCity parentCity) {
        this.parentCity = parentCity;
    }

    public List<SupplementalAdminArea> getSupplementalAdminAreas() {
        return supplementalAdminAreas;
    }

    public void setSupplementalAdminAreas(List<SupplementalAdminArea> supplementalAdminAreas) {
        this.supplementalAdminAreas = supplementalAdminAreas;
    }

    public List<String> getDataSets() {
        return dataSets;
    }

    public void setDataSets(List<String> dataSets) {
        this.dataSets = dataSets;
    }

    @Override
    public String toString() {
        return "SearchRepository{" +
                "version=" + version +
                ", key='" + key + '\'' +
                ", type='" + type + '\'' +
                ", rank=" + rank +
                ", localizedName='" + localizedName + '\'' +
                ", englishName='" + englishName + '\'' +
                ", primaryPostalCode='" + primaryPostalCode + '\'' +
                ", region=" + region +
                ", country=" + country +
                ", administrativeArea=" + administrativeArea +
                ", timeZone=" + timeZone +
                ", geoPosition=" + geoPosition +
                ", isAlias=" + isAlias +
                ", parentCity=" + parentCity +
                ", supplementalAdminAreas=" + supplementalAdminAreas +
                ", dataSets=" + dataSets +
                '}';
    }

    @SerializedName("Version")
    @Expose
    public Integer version;
    @SerializedName("Key")
    @Expose
    public String key;
    @SerializedName("Type")
    @Expose
    public String type;
    @SerializedName("Rank")
    @Expose
    public Integer rank;
    @SerializedName("LocalizedName")
    @Expose
    public String localizedName;
    @SerializedName("EnglishName")
    @Expose
    public String englishName;
    @SerializedName("PrimaryPostalCode")
    @Expose
    public String primaryPostalCode;
    @SerializedName("Region")
    @Expose
    public Region region;
    @SerializedName("Country")
    @Expose
    public Country country;
    @SerializedName("AdministrativeArea")
    @Expose
    public AdministrativeArea administrativeArea;
    @SerializedName("TimeZone")
    @Expose
    public TimeZone timeZone;
    @SerializedName("GeoPosition")
    @Expose
    public GeoPosition geoPosition;
    @SerializedName("IsAlias")
    @Expose
    public Boolean isAlias;
    @SerializedName("ParentCity")
    @Expose
    public ParentCity parentCity;
    @SerializedName("SupplementalAdminAreas")
    @Expose
    public List<SupplementalAdminArea> supplementalAdminAreas = null;
    @SerializedName("DataSets")
    @Expose
    public List<String> dataSets = null;

}
