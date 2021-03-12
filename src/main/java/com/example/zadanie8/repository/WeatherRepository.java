package com.example.zadanie8.repository;

import com.example.zadanie8.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

    @Override
    Weather save(Weather weather);

}
