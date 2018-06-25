package com.asoview.weather.core.service;

import com.asoview.weather.core.model.weatherdate.WeatherDateRepository;
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

}
