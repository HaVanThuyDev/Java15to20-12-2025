package com.example.java.OPP.MoreRealistic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bike newBike = new Bike();
        newBike.move();
        Car newCar = new Car();
        newCar.move();
        Truck newTruck = new Truck();
        newTruck.move();
        List<Vehicle> newVehicles = new ArrayList<Vehicle>();
        newVehicles.add(newBike);
        newVehicles.add(newCar);
        newVehicles.add(newTruck);
        System.out.println("Danh sach sau khi duyet la");
        for (Vehicle vehicle : newVehicles) {
            vehicle.move();
        }
    }
}
