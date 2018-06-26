package com.asoview.weather.core.model.city;

import com.asoview.weather.core.model.weather.register.Criteria;

import java.util.List;

public interface CityRepository {
    List<CitySummary> findByCity(Criteria criteria);
}
