package com.asoview.weather.core.model.weatherdate;

public class WeatherDateSummary {
    String cityId = "";
    String cityName = "";
    String weatherDate = "";

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
}
