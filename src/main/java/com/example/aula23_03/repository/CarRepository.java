package com.example.aula23_03.repository;

import java.util.HashMap;

import com.example.aula23_03.model.Car;

import org.springframework.stereotype.Repository;

/**
 * Repository
 */
@Repository
public class CarRepository {
    HashMap <Integer,Car> hm = new HashMap<>();

    public CarRepository()
    {
        hm.put(1, new Car(1, "ABC-1234", "Branco", "Palio", 2012));
        hm.put(2, new Car(2, "DEF-3214", "Preto", "Corsa", 2002));
        hm.put(3, new Car(3, "HIJ-4567", "Azul", "Golf", 2014));
        hm.put(4, new Car(4, "KLM-6549", "Roxo", "Camaro", 2020));
        hm.put(5, new Car(5, "MLK-7893", "Vermelho", "Uno", 2000));

    }
    public Car getCarID(int id)
    {
        return hm.get(id);
    }
    public HashMap<Integer,Car> getAllCars()
    {
        return hm;
    }
}