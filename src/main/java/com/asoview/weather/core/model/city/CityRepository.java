package com.asoview.weather.core.model.city;

import com.asoview.weather.core.model.weather.register.Criteria;

public interface CityRepository {
    CitySummary findByCity(Criteria criteria);
}
