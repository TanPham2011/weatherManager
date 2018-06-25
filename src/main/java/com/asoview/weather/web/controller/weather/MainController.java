package com.asoview.weather.web.controller.weather;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value="", method=RequestMethod.GET)
    public String sayHello(){
        return "weatherday/index";
    }
}
