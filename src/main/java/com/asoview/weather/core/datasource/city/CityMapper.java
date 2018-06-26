package com.asoview.weather.core.datasource.city;

import com.asoview.weather.core.model.city.CitySummary;
import com.asoview.weather.core.model.weather.register.Criteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {
    List<CitySummary> findByCity(@Param("criteria")Criteria criteria);
}
