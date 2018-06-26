package com.asoview.weather.core.service.api;

import com.asoview.weather.core.model.api.WeatherDateAPI;
import org.springframework.beans.factory.annotation.Value;
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

    private final RestTemplate restTemplate = new RestTemplate(new SimpleClientHttpRequestFactory());

    @Value("${openweathermap.url}")
    private String weather_url;

    @Value("${openweathermap.api-key}")
    private String apiKey;

    public WeatherDateAPI getCurrentWeatherDataAPI(String cityId) {
        return getDataAPI(new UriTemplate(weather_url).expand(cityId, this.apiKey), WeatherDateAPI.class);
    }


    private <T> T getDataAPI(URI url, Class<T> responseType) {
        RequestEntity<?> request = RequestEntity.get(url)
                .accept(MediaType.APPLICATION_JSON).build();
        ResponseEntity<T> exchange = this.restTemplate
                .exchange(request, responseType);
        return exchange.getBody();
    }

}
