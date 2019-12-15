package model.entity;

public abstract class AbstractVehicle implements Vehicle {
    private String vendor;
    private int maxSpeed;
    private String fuelConsumption;
    private int value;

    public AbstractVehicle(String vendor, int maxSpeed, String fuelConsumption, int value) {
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

    public String fuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int value() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
