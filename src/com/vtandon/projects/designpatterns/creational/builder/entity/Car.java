package com.vtandon.projects.designpatterns.creational.builder.entity;

public class Car {

    String engine;
    String seats;
    String body;
    String gps;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seats='" + seats + '\'' +
                ", body='" + body + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
