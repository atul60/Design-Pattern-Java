package com.example.CreationPattern.BuilderPattern.builders;

import com.example.CreationPattern.BuilderPattern.builders.components.Engine;
import com.example.CreationPattern.BuilderPattern.builders.components.GPSNavigator;
import com.example.CreationPattern.BuilderPattern.builders.components.Transmission;
import com.example.CreationPattern.BuilderPattern.builders.components.TripComputer;
import com.example.CreationPattern.BuilderPattern.cars.Car;
import com.example.CreationPattern.BuilderPattern.cars.CarType;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripcomputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripcomputer) {
        this.tripcomputer = tripcomputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripcomputer, gpsNavigator);
    }

}
