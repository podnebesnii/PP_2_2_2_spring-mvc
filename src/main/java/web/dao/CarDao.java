package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao {
    private List<Car> list;

    public List<Car> listCars() {
        list = new ArrayList<>();
        list.add(new Car("BMW", "X", 6));
        list.add(new Car("AUDI", "Y", 3));
        list.add(new Car("MERCEDES", "Z", 1));
        list.add(new Car("HONDA", "A", 2));
        list.add(new Car("LADA", "B", 11));
        return list;
    }
}
