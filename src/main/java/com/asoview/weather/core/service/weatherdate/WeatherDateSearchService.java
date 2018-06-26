package com.asoview.weather.core.service.weatherdate;

import com.asoview.weather.core.model.api.WeatherDateAPI;
import com.asoview.weather.core.model.city.CitySummary;
import com.asoview.weather.core.model.weatherdate.WeatherDateData;
import com.asoview.weather.core.model.weatherdate.WeatherDateRepository;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummaries;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import com.asoview.weather.core.service.api.OpenWeatherAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherDateSearchService {

    @Autowired
    WeatherDateRepository weatherDateRepository;

    @Autowired
    OpenWeatherAPI openWeatherAPI;

    public List<WeatherDateSummary> getAllData(){
        return weatherDateRepository.getAll();
    }

    public WeatherDateSummaries weatherDateList(){
        return weatherDateRepository.weatherDateList();
    }

    public void deleteWeatherDateById(Integer weatherDateId){
        weatherDateRepository.deleteWeatherDateById(weatherDateId);
    }

    public WeatherDateSummaries weatherDateListByCity(List<CitySummary> citySummaries){
        return weatherDateRepository.weatherDateListByCity(citySummaries);
    }

    public void deleteWeatherDateByCurrentDate(String cityId){
        weatherDateRepository.deleteWeatherDateByCurrentDate(cityId);
    }

    public void registerWeatherDateDate(List<CitySummary> citySummaries){
        for(CitySummary citySummary:citySummaries){
            WeatherDateAPI weatherDateAPI = openWeatherAPI.getCurrentWeather(citySummary.getId());
            if(weatherDateAPI.isValid()) {
                deleteWeatherDateByCurrentDate(citySummary.getId());
                weatherDateRepository.register(new WeatherDateData(weatherDateAPI, citySummary));
            }
        }
    }

}
