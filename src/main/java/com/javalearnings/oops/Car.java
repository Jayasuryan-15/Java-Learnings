package com.javalearnings.oops;

public class Car {
    public void drive() {
        System.out.println("The car is being driven");
    }
}

class Audi extends Car {
    @Override
    public void drive() {
        System.out.println("The Audi is being driven");
    }
}

class BMW extends Car {
    @Override
    public void drive() {
        System.out.println("The BMW is being driven");
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Audi();
        Car car2 = new BMW();

        car1.drive();
        car2.drive();
    }
}








