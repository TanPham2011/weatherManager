package com.asoview.weather.web.controller.weather;

import com.asoview.weather.core.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value="", method=RequestMethod.GET)
    public String sayHello(){
        return "weatherday/index";
    }
}
