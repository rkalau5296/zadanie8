package com.example.zadanie8.url;

import com.example.zadanie8.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class Url {

    final RestTemplate restTemplate;

    @Autowired
    public Url(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public List<Weather> getSynopticData() {

        URI uri = UriComponentsBuilder.fromHttpUrl("https://danepubliczne.imgw.pl/api/data/synop")
                .build().encode().toUri();

        Weather[] data = restTemplate.getForObject(uri, Weather[].class);

        return Arrays.asList(Optional.ofNullable(data).orElse(new Weather[0]));
    }
}
