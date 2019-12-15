package model.entity;

public abstract class AbstractVehicle implements Vehicle {
    private String vendor;
    private int maxSpeed;
    private int fuelConsumption;
    private int value;

    public AbstractVehicle(String vendor, int maxSpeed, int fuelConsumption, int value) {
        this.vendor = vendor;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.value = value;
    }

    public String vendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int maxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int fuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int value() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
