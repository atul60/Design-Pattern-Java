package com.example.CreationPattern.BuilderPattern.cars;

import com.example.CreationPattern.BuilderPattern.builders.components.Engine;
import com.example.CreationPattern.BuilderPattern.builders.components.GPSNavigator;
import com.example.CreationPattern.BuilderPattern.builders.components.Transmission;
import com.example.CreationPattern.BuilderPattern.builders.components.TripComputer;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripcomputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripcomputer,
            GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripcomputer = tripcomputer;
        if (this.tripcomputer != null) {
            this.tripcomputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripcomputer;
    }

    public GPSNavigator getGPSNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }
}
