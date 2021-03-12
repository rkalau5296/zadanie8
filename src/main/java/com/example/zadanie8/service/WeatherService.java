package com.example.zadanie8.service;

import com.example.zadanie8.model.Weather;
import com.example.zadanie8.repository.WeatherRepository;
import com.example.zadanie8.url.Url;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherService.class);

    private final Url url;
    private final WeatherRepository weatherRepository;

    @Autowired
    public WeatherService(Url url, WeatherRepository weatherRepository) {
        this.url = url;
        this.weatherRepository = weatherRepository;
    }

    @Scheduled(cron="0 0 */1 * * *")
    public void getAllByTemperature(){

        LOGGER.info("fetching weather data....");
        url.getSynopticData().forEach(weatherRepository::save);
    }
}
