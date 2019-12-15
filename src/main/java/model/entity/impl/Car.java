package model.entity.impl;

import model.entity.AbstractVehicle;

public class Car extends AbstractVehicle {

    private int passengerAmount;

    public Car(String vendor, int maxSpeed, int fuelConsumption, int value, int passengerAmount) {
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
