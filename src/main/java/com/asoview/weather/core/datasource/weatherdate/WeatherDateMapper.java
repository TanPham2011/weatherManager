package com.asoview.weather.core.datasource.weatherdate;

import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;

import java.util.List;

public interface WeatherDateMapper {
    List<WeatherDateSummary> getAll();
}
