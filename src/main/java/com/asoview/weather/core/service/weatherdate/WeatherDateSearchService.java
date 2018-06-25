package com.asoview.weather.core.service.weatherdate;

import com.asoview.weather.core.model.weatherdate.WeatherDateRepository;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummaries;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherDateSearchService {

    @Autowired
    WeatherDateRepository weatherDateRepository;

    public List<WeatherDateSummary> getAllData(){
        return weatherDateRepository.getAll();
    }

    public WeatherDateSummaries weatherDateList(){
        return weatherDateRepository.weatherDateList();
    }

    public void deleteWeatherDateById(Integer weatherDateId){
        weatherDateRepository.deleteWeatherDateById(weatherDateId);
    }

}
