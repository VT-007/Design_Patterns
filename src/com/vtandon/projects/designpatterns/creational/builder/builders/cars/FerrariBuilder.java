package com.vtandon.projects.designpatterns.creational.builder.builders.cars;

import com.vtandon.projects.designpatterns.creational.builder.entity.Car;

public class FerrariBuilder implements ICarBuilder {

    Car car;

    public FerrariBuilder() {
        this.car = new Car();
    }

    @Override
    public void setEngine() {
        this.car.setEngine("Ferrari Engine");
    }

    @Override
    public void setSeats() {
        this.car.setSeats("2");
    }

    @Override
    public void setGPS() {
        this.car.setGps("On");
    }

    @Override
    public void setBody() {
        this.car.setBody("Aero dynamic");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
