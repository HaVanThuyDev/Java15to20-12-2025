package com.example.java.OPP.MoreRealistic;

public abstract class Vehicle {
    private int speed;
    private String fuel;
    public abstract void move();

    public String getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }
}
