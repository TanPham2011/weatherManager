package com.asoview.weather.core.model.weatherdate;

import java.util.List;

public interface WeatherDateRepository {
    List<WeatherDateSummary> getAll();
    WeatherDateSummaries weatherDateList();
    void deleteWeatherDateById(Integer weatherDateId);
    WeatherDateSummaries weatherDateListByCity(String cityId);
}
