package model.entity.impl;

import model.entity.VehicleImpl;

public class Car extends VehicleImpl {

    private int passengerAmount;

    public Car(String vendor, String maxSpeed, String fuelConsumption, int value, int passengerAmount) {
        super(vendor, maxSpeed, fuelConsumption, value);
        this.passengerAmount = passengerAmount;
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }
}
