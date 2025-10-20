package com.example.CreationPattern.BuilderPattern;

import com.example.CreationPattern.BuilderPattern.builders.CarBuilder;
import com.example.CreationPattern.BuilderPattern.builders.CarManualBuilder;
import com.example.CreationPattern.BuilderPattern.cars.Car;
import com.example.CreationPattern.BuilderPattern.cars.Manual;
import com.example.CreationPattern.BuilderPattern.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.

        Car car = builder.getResult();
        System.out.println("Car build:\n" + car.getCarType());

        // CarManual mannual = new CarManual(car.getCarType(), car.getSeats(),
        // car.getEngine(), car.getTransmission(), car.getTripComputer(),
        // car.gpsNavigator())
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar manual build:\n" + manual.print());

    }
}
