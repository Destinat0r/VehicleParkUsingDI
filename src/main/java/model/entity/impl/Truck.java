package model.entity.impl;

import model.entity.VehicleImpl;

public class Truck extends VehicleImpl {

    private int payload;

    public Truck(String vendor, String maxSpeed, String fuelConsumption, int value, int payload) {
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
