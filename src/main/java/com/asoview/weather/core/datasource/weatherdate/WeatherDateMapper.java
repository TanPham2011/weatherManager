package com.asoview.weather.core.datasource.weatherdate;

import com.asoview.weather.core.model.weatherdate.WeatherDateData;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WeatherDateMapper {
    List<WeatherDateSummary> getAll();
    void remove(@Param("weatherDateId") Integer weatherDateId);
    void removeByCurrentDate(@Param("cityId") String cityId);
    void register(@Param("weatherDateData")WeatherDateData weatherDateData);
}
