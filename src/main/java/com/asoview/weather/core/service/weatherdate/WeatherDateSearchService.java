package com.asoview.weather.core.service.weatherdate;

import com.asoview.weather.core.model.weatherdate.WeatherDateData;
import com.asoview.weather.core.model.weatherdate.WeatherDateRepository;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummaries;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.text.SimpleDateFormat;

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

    public WeatherDateSummaries weatherDateListByCity(String cityId){
        return weatherDateRepository.weatherDateListByCity(cityId);
    }

    public void deleteWeatherDateByCurrentDate(String cityId){
        weatherDateRepository.deleteWeatherDateByCurrentDate(cityId);
    }

    public void registerWeatherDateDate(WeatherDateData weatherDateData){
        weatherDateRepository.register(weatherDateData);
    }

}
