package com.example.weather.controller;

import com.example.weather.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyModel model;

    @RequestMapping(value="/sayHello", method=RequestMethod.GET)
    public String sayHello(){
        model.setName("Hello world");
        return model.toString();
    }
}
