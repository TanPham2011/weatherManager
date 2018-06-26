package com.asoview.weather.core.datasource.weatherdate;

import com.asoview.weather.core.model.city.CitySummary;
import com.asoview.weather.core.model.weatherdate.WeatherDateData;
import com.asoview.weather.core.model.weatherdate.WeatherDateRepository;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummaries;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Repository
public class WeatherDateDataSource implements WeatherDateRepository {

    @Autowired
    WeatherDateMapper weatherDateMapper;

    @Override
    public List<WeatherDateSummary> getAll(){
        return weatherDateMapper.getAll();
    }

    @Override
    public WeatherDateSummaries weatherDateList(){
        return new WeatherDateSummaries(weatherDateMapper.getAll());
    }

    @Override
    public void deleteWeatherDateById(Integer weatherDateId){
        weatherDateMapper.remove(weatherDateId);
    }

    @Override
    public WeatherDateSummaries weatherDateListByCity(List<CitySummary> citySummaries){
        List<WeatherDateSummary> result = weatherDateMapper.getAll();
        List<WeatherDateSummary> values = new ArrayList<>();
        for (CitySummary citySummary:citySummaries) {
            for(WeatherDateSummary item : result){
                if(item.getCityId().equals(citySummary.getId())){
                    values.add(item);
                }
            }
        }
        return new WeatherDateSummaries(values);
    }

    @Override
    public void deleteWeatherDateByCurrentDate(String cityId){
        weatherDateMapper.removeByCurrentDate(cityId);
    }

    @Override
    public void register(WeatherDateData weatherDateData){
        weatherDateMapper.register(weatherDateData);
    }
}
