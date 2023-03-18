package com.driver;

public class Boat implements WaterVehicle {
    public String name;
    public int capacity;

    public Boat(int capacity) {
        this.capacity = capacity;
    }

    public Boat(String name) {
        this.name = name;
    }

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
