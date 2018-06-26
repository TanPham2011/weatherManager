package com.asoview.weather.core.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class WeatherDateAPI implements Serializable {

    private String weatherStatus;
    private String weatherIcon;
    private double weatherTemperature;
    private String weatherPressure;
    private double weatherWindSpeed;
    private String weatherClouds;

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

    public Double getWeatherTemperature() {
        return weatherTemperature;
    }

    public void setWeatherTemperature(double temperature) {
        this.weatherTemperature = temperature;
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

    @JsonProperty("weather")
    public void setWeather(List<Map<String, Object>> weatherEntries) {
        Map<String, Object> weather = weatherEntries.get(0);
        setWeatherStatus((String)weather.get("main"));
        setWeatherIcon((String) weather.get("icon"));
    }

    @JsonProperty("main")
    public void setMain(Map<String, Object> main) {
        setWeatherTemperature(Double.parseDouble(main.get("temp").toString()));
        setWeatherPressure(main.get("pressure").toString());
    }

    @JsonProperty("wind")
    public void setWind(Map<String, Object> wind) {
        setWeatherWindSpeed(Double.parseDouble(wind.get("speed").toString()));
    }

    @JsonProperty("clouds")
    public void setClouds(Map<String, Object> clouds) {
        setWeatherClouds(clouds.get("all").toString());
    }

    private boolean checkNullOrEmpty(String object){

        if(object.isEmpty() || object == null)
            return true;

        return false;
    }


    public boolean isValid(){
        if(checkNullOrEmpty(this.weatherStatus) || checkNullOrEmpty(this.weatherIcon) ||
                checkNullOrEmpty(String.valueOf(this.weatherTemperature)) || checkNullOrEmpty(this.weatherPressure) ||
                checkNullOrEmpty(String.valueOf(this.weatherWindSpeed)) || checkNullOrEmpty(this.weatherClouds))
            return false;
        return true;
    }



}
