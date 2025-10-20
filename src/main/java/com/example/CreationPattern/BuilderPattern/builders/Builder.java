package com.example.CreationPattern.BuilderPattern.builders;

import com.example.CreationPattern.BuilderPattern.builders.components.Engine;
import com.example.CreationPattern.BuilderPattern.builders.components.GPSNavigator;
import com.example.CreationPattern.BuilderPattern.builders.components.Transmission;
import com.example.CreationPattern.BuilderPattern.builders.components.TripComputer;
import com.example.CreationPattern.BuilderPattern.cars.CarType;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripcomputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
