package com.asoview.weather.core.datasource.city;

import com.asoview.weather.core.model.city.CityRepository;
import com.asoview.weather.core.model.city.CitySummary;
import com.asoview.weather.core.model.weather.register.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CityDataSource implements CityRepository {

    @Autowired
    CityMapper cityMapper;

    @Override
    public CitySummary findByCity(Criteria criteria){
        return cityMapper.findByCity(criteria);

    }
}
