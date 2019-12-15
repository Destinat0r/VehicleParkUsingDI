package model.entity;

public abstract class VehicleImpl implements Vehicle {
    private String licensePlate;
    private String vendor;
    private String maxSpeed;

    public VehicleImpl(String licensePlate, String vendor, String maxSpeed) {
        this.licensePlate = licensePlate;
        this.vendor = vendor;
        this.maxSpeed = maxSpeed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
