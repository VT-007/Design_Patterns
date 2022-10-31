package com.vtandon.projects.designpatterns.creational.builder.builders.cars;

import com.vtandon.projects.designpatterns.creational.builder.entity.Car;

public interface ICarBuilder {

    void setEngine();
    void setSeats();
    void setGPS();
    void setBody();
    Car getCar();
}
