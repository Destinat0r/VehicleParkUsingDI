package model.entity.impl;

import model.entity.AbstractVehicle;

public class Truck extends AbstractVehicle {

    private int payload;

    public Truck(String vendor, int maxSpeed, String fuelConsumption, int value, int payload) {
        super(vendor, maxSpeed, fuelConsumption, value);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }
}
