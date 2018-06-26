package com.asoview.weather.core.model.weatherdate;

import com.asoview.weather.core.model.api.WeatherDateAPI;
import com.asoview.weather.core.model.city.CitySummary;

public class WeatherDateData {
    String cityId;
    String weatherStatus;
    String weatherIcon;
    double weatherTemperature;
    String weatherPressure;
    double weatherWindSpeed;
    String weatherClouds;

    public WeatherDateData() {
    }

    public WeatherDateData(WeatherDateAPI weatherDateAPI, CitySummary citySummary) {
        this.setCityId(citySummary.getId());
        this.setWeatherStatus(weatherDateAPI.getWeatherStatus());
        this.setWeatherIcon(weatherDateAPI.getWeatherIcon());
        this.setWeatherTemperature(weatherDateAPI.getWeatherTemperature());
        this.setWeatherPressure(weatherDateAPI.getWeatherPressure());
        this.setWeatherWindSpeed(weatherDateAPI.getWeatherWindSpeed());
        this.setWeatherClouds(weatherDateAPI.getWeatherClouds());
    }


    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
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
