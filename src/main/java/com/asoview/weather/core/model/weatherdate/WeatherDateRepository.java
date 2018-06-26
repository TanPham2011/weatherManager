package com.asoview.weather.core.model.weatherdate;


import com.asoview.weather.core.model.city.CitySummary;

import java.util.Date;
import java.util.List;

public interface WeatherDateRepository {
    List<WeatherDateSummary> getAll();
    WeatherDateSummaries weatherDateList();
    void deleteWeatherDateById(Integer weatherDateId);
    WeatherDateSummaries weatherDateListByCity(List<CitySummary> citySummaries);
    void deleteWeatherDateByCurrentDate(String cityId);
    void register(WeatherDateData weatherDateData);
}
