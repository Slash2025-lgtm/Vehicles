package com.pluralsight;

import com.pluralsight.model.Moped;

public class Main {
    public static void main(String[] args) {
    mopedToggle();
    }

    public static void mopedToggle() {
        Moped slowRide = new Moped();

        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.printf("Color: %s\nFuel Capacity: %s", slowRide.getColor(), slowRide.getFuelCapacity());
    }
}
