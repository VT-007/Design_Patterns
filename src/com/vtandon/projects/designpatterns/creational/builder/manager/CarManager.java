package com.vtandon.projects.designpatterns.creational.builder.manager;

import com.vtandon.projects.designpatterns.creational.builder.builders.cars.ICarBuilder;
import com.vtandon.projects.designpatterns.creational.builder.entity.Car;

public class CarManager {

    ICarBuilder builder;

    public CarManager(ICarBuilder builder) {
        this.builder = builder;
    }

    public void buildCar() {
        this.builder.setBody();
        this.builder.setEngine();
        this.builder.setSeats();
        this.builder.setGPS();
    }

    public Car getCar() {
      return this.builder.getCar();
    }

}
