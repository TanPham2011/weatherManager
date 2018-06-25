package com.asoview.weather.core.datasource.weatherdate;

import com.asoview.weather.core.model.weatherdate.WeatherDateRepository;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummaries;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
