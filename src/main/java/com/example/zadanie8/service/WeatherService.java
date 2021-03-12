package com.example.zadanie8.service;

import com.example.zadanie8.model.Weather;
import com.example.zadanie8.repository.WeatherRepository;
import com.example.zadanie8.url.Url;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    private final Url url;
    private final WeatherRepository weatherRepository;

    public WeatherService(Url url, WeatherRepository weatherRepository) {
        this.url = url;
        this.weatherRepository = weatherRepository;
    }

    public List<Weather> getAllByTemperature(){
        List<Weather> synopticData = url.getSynopticData();
        for(Weather weather: synopticData){
            weatherRepository.save(weather);
        }

        return synopticData;
    }
}
