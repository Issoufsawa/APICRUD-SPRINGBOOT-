package io.tutorial.spring.garageApp1.repository;

import io.tutorial.spring.garageApp1.Model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car,Long> {
}
