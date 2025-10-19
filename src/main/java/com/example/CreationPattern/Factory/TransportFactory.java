package com.example.CreationPattern.Factory;

class Modes {
    public static final String TRUCK = "Truck";
    public static final String SHIP = "Ship";
    public static final String AIRPLANE = "Airplane";
}

class TransportFactory {

    public Transport createTransport(String mode) {
        switch (mode) {
            case Modes.TRUCK:
                return new Truck();
            case Modes.SHIP:
                return new Ship();
            case Modes.AIRPLANE:
                return new Airplane();
            default:
                throw new IllegalArgumentException("Unknown mode of transport: " + mode);
        }
    }
}