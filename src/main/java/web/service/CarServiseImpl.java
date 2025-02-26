package web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import web.dao.CarDao;
import web.model.Car;


@Component
public class CarServiseImpl implements CarServise {

    private final CarDao carDao;

    @Autowired
    public CarServiseImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> listOfCars() {
        return carDao.listOfCars();
    }

    @Override
    public List<Car> listOfCars( Integer amount ) {
		if ( amount == null ) {
			return carDao.listOfCars();
		} else {
			return carDao.listOfCars( amount );
		}
    }
}
