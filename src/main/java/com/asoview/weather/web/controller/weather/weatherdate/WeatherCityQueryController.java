package com.asoview.weather.web.controller.weather.weatherdate;

import com.asoview.weather.core.model.city.CitySummary;
import com.asoview.weather.core.model.weather.register.Criteria;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummaries;
import com.asoview.weather.core.model.weatherdate.WeatherDateSummary;
import com.asoview.weather.core.service.weatherdate.WeatherDateSearchService;
import com.asoview.weather.core.service.city.CitySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/weather-day/query")
@SessionAttributes(value = "criteriaOfWeather")
class WeatherCityQueryController {

    @Autowired
    CitySearchService citySearchService;

    @Autowired
    WeatherDateSearchService weatherDateSearchService;

    @ModelAttribute("criteriaOfWeather")
    Criteria criteria() {
        return new Criteria();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    String start() { return "weatherday/query/list"; }

    @RequestMapping(value = "", method = RequestMethod.POST)
    String search(@Validated @ModelAttribute("criteriaOfWeather") Criteria criteria,
                  BindingResult result,
                  RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) return "weatherday/query/list";

        WeatherDateSummaries weatherDateSummaries = new WeatherDateSummaries(new ArrayList<WeatherDateSummary>());

        CitySummary citySummary = citySearchService.findByCityName(criteria);
        if(citySummary != null){
            weatherDateSummaries = weatherDateSearchService.weatherDateListByCity(citySummary.getId());
        }

        if(weatherDateSummaries.values.isEmpty()){
            redirectAttributes.addFlashAttribute("noDataFound","Not match result data found");
        }
        redirectAttributes.addFlashAttribute("weatherDateSummaries",weatherDateSummaries);
        return "redirect:/weather-day/query";
    }
}
