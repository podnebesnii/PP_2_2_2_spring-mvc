package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarService {
    private CarDao carDao = new CarDao();
    public List<Car> listCars(){
        return carDao.listCars();
    }
}
