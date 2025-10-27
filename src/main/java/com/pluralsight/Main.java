package com.pluralsight;

import com.pluralsight.model.Car;
import com.pluralsight.model.Hovercraft;
import com.pluralsight.model.Moped;
import com.pluralsight.model.SemiTruck;

public class Main {
    public static void main(String[] args) {
        mopedToggle();
        carToggle();
        hovercraftToggle();
        semiTruckToggle();
    }

    public static void mopedToggle() {
        Moped slowRide = new Moped();

        System.out.printf("\n=== Moped ===\nColor: %s\nFuel Capacity: %s\n", slowRide.getColor(), slowRide.getFuelCapacity());
    }

    public static void carToggle() {
        Car car = new Car();

        System.out.printf("\n=== Car ===\nColor: %s\nFuel Capacity: %s\n", car.getColor(), car.getFuelCapacity());
    }

    public static void hovercraftToggle() {
        Hovercraft hovercraft = new Hovercraft();

        System.out.printf("\n=== Hovercraft ===\nColor: %s\nFuel Capacity: %s\n", hovercraft.getColor(), hovercraft.getFuelCapacity());
    }

    public static void semiTruckToggle() {
        SemiTruck semiTruck = new SemiTruck();

        System.out.printf("\n=== Semi-Truck ===\nColor: %s\nFuel Capacity: %s\n", semiTruck.getColor(), semiTruck.getFuelCapacity());
    }
}
