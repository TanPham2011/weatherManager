package com.asoview.weather.core.model.weatherdate;

public class WeatherDateSummary {
    String cityId = "";
    String cityName = "";
    String weatherDate = "";
    String weatherDateId = "";
    String countryName = "";
    private String weatherStatus;
    private String weatherIcon;
    private double weatherTemperature;
    private String weatherPressure;
    private double weatherWindSpeed;
    private String weatherClouds;

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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherStatus() {
        return weatherStatus;
    }

    public void setWeatherStatus(String weatherStatus) {
        this.weatherStatus = weatherStatus;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public double getWeatherTemperature() {
        return weatherTemperature;
    }

    public void setWeatherTemperature(double weatherTemperature) {
        this.weatherTemperature = weatherTemperature;
    }

    public String getWeatherPressure() {
        return weatherPressure;
    }

    public void setWeatherPressure(String weatherPressure) {
        this.weatherPressure = weatherPressure;
    }

    public double getWeatherWindSpeed() {
        return weatherWindSpeed;
    }

    public void setWeatherWindSpeed(double weatherWindSpeed) {
        this.weatherWindSpeed = weatherWindSpeed;
    }

    public String getWeatherClouds() {
        return weatherClouds;
    }

    public void setWeatherClouds(String weatherClouds) {
        this.weatherClouds = weatherClouds;
    }
}
