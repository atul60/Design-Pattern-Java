package com.example;

/**
 * Hello world!
 *
 */
class Animal {
    final String color = "Red";

    // final void printColor() {
    // System.out.println("Animal Color: " + color);
    // }
}

class Dog extends Animal {

    void printColor() {
        System.out.println("Dog color is " + super.color); // prints color of Dog class\
    }
}

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
        System.out.println("Hello World!");
    }
}
