package web.dao;

import java.util.ArrayList;
import java.util.List;

import web.model.Car;

public class CarHibernateDaoImpl implements CarDao {

    /*
    я случайно начал реализовывать dao с использование hibernate,
    но я не уверен что в этом задании ипользуется sql
    поэтому реализую пока что так
    */ 

    private final List<Car> cars = new ArrayList<>();

    @Override
    public void add(Car car) {
        cars.add( car );
    }

    @Override
    public List<Car> listOfCars() {
        return cars;
    }

    @Override
    public List<Car> listOfCars(int amount) {
        return cars.stream().limit(amount).toList();
    }
    
}
