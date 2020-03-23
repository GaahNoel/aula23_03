package com.example.aula23_03.service;

import java.util.HashMap;

import com.example.aula23_03.model.Car;
import com.example.aula23_03.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarService
 */
@Service
public class CarService {
    @Autowired
    CarRepository car;
    public Car carByID(int id)
    {
        Car carID = car.getCarID(id);
        return carID;
    }
    public HashMap<Integer,Car> getAllCars()
    {
        HashMap cars = car.getAllCars();
        return cars;
    }

}