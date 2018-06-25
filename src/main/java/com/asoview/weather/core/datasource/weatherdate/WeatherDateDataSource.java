package com.asoview.weather.core.datasource.weatherdate;

import com.asoview.weather.core.model.weatherdate.WeatherDateRepository;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummaries;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
    public WeatherDateSummaries weatherDateListByCity(String cityId){
        List<WeatherDateSummary> result = weatherDateMapper.getAll();
        List<WeatherDateSummary> values = new ArrayList<>();
        for(WeatherDateSummary item : result){
            if(item.getCityId().equals(cityId)){
                values.add(item);
            }
        }
        return new WeatherDateSummaries(values);
    }
}
