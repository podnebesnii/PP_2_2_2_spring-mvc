package web.controller;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private int series;

    public Car(String brand, String model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }
}


