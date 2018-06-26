package com.asoview.weather.core.service.api;

import com.asoview.weather.core.model.api.WeatherDateAPI;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.net.URI;

@Service
public class OpenWeatherAPI {

    private static final String WEATHER_URL =
            "http://api.openweathermap.org/data/2.5/weather?id={cityId}&APPID={key}&units=metric";

    private final RestTemplate restTemplate = new RestTemplate(new SimpleClientHttpRequestFactory());

    private final String apiKey = "2e7c898813432fca40573cadaf280fbf";

    public WeatherDateAPI getCurrentWeather(String country, String city) {
        URI url = new UriTemplate(WEATHER_URL).expand(city, country, this.apiKey);
        return getDataAPI(url, WeatherDateAPI.class);
    }

    public WeatherDateAPI getCurrentWeather(String cityId) {
        URI url = new UriTemplate(WEATHER_URL).expand(cityId, this.apiKey);
        return getDataAPI(url, WeatherDateAPI.class);
    }


    private <T> T getDataAPI(URI url, Class<T> responseType) {
        RequestEntity<?> request = RequestEntity.get(url)
                .accept(MediaType.APPLICATION_JSON).build();
        ResponseEntity<T> exchange = this.restTemplate
                .exchange(request, responseType);
        return exchange.getBody();
    }

}
