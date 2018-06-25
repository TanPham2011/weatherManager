package com.asoview.weather.core.datasource.city;

import com.asoview.weather.core.model.city.CitySummary;
import com.asoview.weather.core.model.weather.register.Criteria;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;


public interface CityMapper {
    CitySummary findByCity(@Param("criteria")Criteria criteria);
}