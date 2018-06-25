package com.asoview.weather.core.model.weather.register;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Criteria implements Serializable {
    @NotBlank(message = "Please input search city name")
    String cityName = "";

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}