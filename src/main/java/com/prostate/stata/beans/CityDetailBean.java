package com.prostate.stata.beans;

public class CityDetailBean {

    private String cityName;

    private String parentCityName;

    private String grandfatherCityName;


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getParentCityName() {
        return parentCityName;
    }

    public void setParentCityName(String parentCityName) {
        this.parentCityName = parentCityName;
    }

    public String getGrandfatherCityName() {
        return grandfatherCityName;
    }

    public void setGrandfatherCityName(String grandfatherCityName) {
        this.grandfatherCityName = grandfatherCityName;
    }
}
