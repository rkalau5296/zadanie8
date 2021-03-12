package com.example.zadanie8.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    public String id_stacji;
    @Column
    public String stacja;
    @Column
    public String data_pomiaru;
    @Column
    public String godzina_pomiaru;
    @Column
    public String temperatura;
    @Column
    public String predkosc_wiatru;
    @Column
    public String kierunek_wiatru;
    @Column
    public String wilgotnosc_wzgledna;
    @Column
    public String suma_opadu;
    @Column
    public String cisnienie;


}
