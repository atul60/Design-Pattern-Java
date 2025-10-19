package com.example.CreationPattern.Factory;

public class Ship implements Transport {
    public void deliver() {
        System.out.println("Deliver by sea in a container");
    }
}