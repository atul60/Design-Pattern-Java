package com.example.CreationPattern.Factory;

class Delivery {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Transport transport = transportFactory.createTransport(Modes.TRUCK);
        transport.deliver();
        // Get Actual Transport Object
        // Apply transport method
    }
}