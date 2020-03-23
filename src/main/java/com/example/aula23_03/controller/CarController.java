package com.example.aula23_03.controller;

import java.util.HashMap;

import com.example.aula23_03.model.Car;
import com.example.aula23_03.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller
 */
@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService car;

    @GetMapping("/{id}")
    public ModelAndView carID(@PathVariable("id") int id)
    {
        ModelAndView mv = new ModelAndView("carid");
        Car carid = car.carByID(id);
        mv.addObject("car",carid);
        mv.addObject("id", id);
        return mv;
    }
    @GetMapping("/all")
    public ModelAndView allCars()
    {
        ModelAndView mv = new ModelAndView("allcars");
        HashMap<Integer,Car> cars = car.getAllCars();
        mv.addObject("cars",cars.values());
        return mv;
    }
    
}