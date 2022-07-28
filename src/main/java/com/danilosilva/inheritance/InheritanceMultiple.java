package com.danilosilva.inheritance;

public class InheritanceMultiple {

    public static void main(String[] args) {
        final var driverBus = new Employee();
        driverBus.accelerate();
        driverBus.sit();
        driverBus.collect();
    }
}

interface Driver {
    default void accelerate() {
        System.out.println("Accelerating...");
    }

    default void sit() {
        System.out.println("Driver - Sitting down...");
    }
}

interface Receiver {
    default void collect() {
        System.out.println("Collecting...");
    }

    default void sit() {
        System.out.println("Receiver - Sitting down...");
    }
}

abstract class Factotum {
    void sit() {
        System.out.println("Factotum - Sitting down...");
    }
}

class Employee extends Factotum implements Driver, Receiver {

    @Override
    public void sit() {
        Receiver.super.sit();
    }
}
