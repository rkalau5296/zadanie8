package com.example.zadanie8.controller;

import com.example.zadanie8.model.Weather;
import com.example.zadanie8.repository.WeatherRepository;
import com.example.zadanie8.service.WeatherService;
import com.example.zadanie8.url.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
@CrossOrigin("*")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getData")
    public void getWeatherData (){
        weatherService.getAllByTemperature();
    }


}
