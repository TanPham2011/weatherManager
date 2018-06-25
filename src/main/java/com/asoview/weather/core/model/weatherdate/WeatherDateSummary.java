package com.asoview.weather.core.model.weatherdate;

public class WeatherDateSummary {
    String cityId = "";
    String cityName = "";
    String weatherDate = "";
    String weatherDateId = "";

    public WeatherDateSummary() {
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherDate() {
        return weatherDate;
    }

    public void setWeatherDate(String weatherDate) {
        this.weatherDate = weatherDate;
    }

    public String getWeatherDateId() {
        return weatherDateId;
    }

    public void setWeatherDateId(String weatherDateId) {
        this.weatherDateId = weatherDateId;
    }
}
