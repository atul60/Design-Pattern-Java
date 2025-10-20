package com.example.CreationPattern.BuilderPattern.builders.components;

import com.example.CreationPattern.BuilderPattern.cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car is stopped");
        }
    }
}
