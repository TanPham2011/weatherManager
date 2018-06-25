package com.asoview.weather.core.model.weatherdate;

import java.util.ArrayList;
import java.util.List;

public class WeatherDateSummaries {
    public List<WeatherDateSummary> values = new ArrayList<>();

    public WeatherDateSummaries(List<WeatherDateSummary> values) {
        this.values = values;
    }

    public boolean isNotEmpty(){
        return !this.values.isEmpty();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public List<WeatherDateSummary> getValues() {
        return values;
    }

}
