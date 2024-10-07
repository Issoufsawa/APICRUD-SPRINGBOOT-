package io.tutorial.spring.garageApp1.service;

import io.tutorial.spring.garageApp1.Controller.GarageController;
import io.tutorial.spring.garageApp1.Model.Car;
import io.tutorial.spring.garageApp1.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {
    @Autowired
    private GarageRepository garageRepository;

     public List<Car> getCars(){
         List<Car> cars = new ArrayList<>();
         garageRepository.findAll().forEach(car -> {
             cars.add(car);
         });
         return cars;
     }

    public Car getCars(long id) {
         return garageRepository.findById(id).orElse(null);
    }

    public void deleteCar(long id) {
         garageRepository.deleteById(id);
    }

    public void addCar(Car car) {
        garageRepository.save(car);
    }

    public void update(Car car, long id) {
        garageRepository.save(car);
    }
}
