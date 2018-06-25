package com.asoview.weather.core.datasource.weatherdate;

import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeatherDateMapper {
    List<WeatherDateSummary> getAll();
    void remove(@Param("weatherDateId") Integer weatherDateId);
}
