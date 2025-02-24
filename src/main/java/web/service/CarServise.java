package web.service;

import java.util.List;

import web.model.Car;

public interface CarServise {
    void add(Car car);
    List<Car> listOfCars();
    List<Car> listOfCars( int amount );
}

