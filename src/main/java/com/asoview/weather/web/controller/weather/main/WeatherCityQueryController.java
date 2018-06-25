package com.asoview.weather.web.controller.weather.main;

import com.asoview.weather.core.model.city.CitySummary;
import com.asoview.weather.core.model.weather.register.Criteria;
import com.asoview.weather.core.service.city.CitySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping(value = "/weather-day/query")
@SessionAttributes(value = "criteriaOfWeather")
class WeatherCityQueryController {

    @Autowired
    CitySearchService citySearchService;

    @ModelAttribute("criteriaOfWeather")
    Criteria criteria() {
        return new Criteria();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    String start() {
        return "weatherday/query/list";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    String search(@Validated @ModelAttribute("criteriaOfWeather") Criteria criteria,
                  BindingResult result,
                  RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) return "weatherday/query/list";

        //String a = criteria.getCityName();

        CitySummary citySummary = citySearchService.findByCityName(criteria);
        if(citySummary == null){
            String a = "99";
        }
//        PartnerSummaries partnerSummaries = partnerSearchService.listByCriteria(criteria);
//        redirectAttributes.addFlashAttribute("partnerSummaries", partnerSummaries);
        return "redirect:/weather-day/query";
    }
}
