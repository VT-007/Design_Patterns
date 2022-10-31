package com.vtandon.projects.designpatterns.creational.builder.builders.cars;

import com.vtandon.projects.designpatterns.creational.builder.entity.Car;

public class VWBuilder implements ICarBuilder {

    Car car;

    public VWBuilder() {
        this.car = new Car();
    }

    @Override
    public void setEngine() {
        this.car.setEngine("VW Engine");
    }

    @Override
    public void setSeats() {
        this.car.setSeats("4");
    }

    @Override
    public void setGPS() {
        this.car.setGps("On");
    }

    @Override
    public void setBody() {
        this.car.setBody("SUV");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
