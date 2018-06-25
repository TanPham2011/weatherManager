package com.asoview.weather.core.service.city;

import com.asoview.weather.core.model.city.CityRepository;
import com.asoview.weather.core.model.city.CitySummary;
import com.asoview.weather.core.model.weather.register.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitySearchService {

    @Autowired
    CityRepository cityRepository;

    public CitySummary findByCityName(Criteria criteria){
        return cityRepository.findByCity(criteria);
    }

}
