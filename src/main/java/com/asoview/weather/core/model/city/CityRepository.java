package com.asoview.weather.core.model.city;

import com.asoview.weather.core.model.weather.register.Criteria;
import org.springframework.stereotype.Repository;


public interface CityRepository {
    CitySummary findByCity(Criteria criteria);
}
