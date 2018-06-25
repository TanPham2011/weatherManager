package com.asoview.weather.web.controller.weather.weatherdate;

import com.asoview.weather.core.service.weatherdate.WeatherDateSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/weather-day/delete/{weatherDateId}")
class WeatherCityDeleteController {

    @Autowired
    WeatherDateSearchService weatherDateSearchService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    String delete(@PathVariable("weatherDateId")Integer weatherDateId, RedirectAttributes attributes) {
        weatherDateSearchService.deleteWeatherDateById(weatherDateId);
        attributes.addFlashAttribute("message", "Delete data successfully");
        return "redirect:/weather-day/query";
    }
}
