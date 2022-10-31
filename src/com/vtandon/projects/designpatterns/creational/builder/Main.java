package com.vtandon.projects.designpatterns.creational.builder;

import com.vtandon.projects.designpatterns.creational.builder.builders.cars.FerrariBuilder;
import com.vtandon.projects.designpatterns.creational.builder.builders.cars.ICarBuilder;
import com.vtandon.projects.designpatterns.creational.builder.builders.cars.VWBuilder;
import com.vtandon.projects.designpatterns.creational.builder.entity.Car;
import com.vtandon.projects.designpatterns.creational.builder.manager.CarManager;

public class Main {
    public static void main(String[] args) {
        ICarBuilder ferrariBuilder = new FerrariBuilder();
        CarManager carManager = new CarManager(ferrariBuilder);
        carManager.buildCar();
        Car car = carManager.getCar();
        System.out.println(car.toString());

        ICarBuilder vwBuilder = new VWBuilder();
        CarManager carManager1 = new CarManager(vwBuilder);
        carManager1.buildCar();
        Car car1 = carManager1.getCar();
        System.out.println(car1.toString());

    }
}
