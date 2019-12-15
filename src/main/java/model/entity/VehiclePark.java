package model.entity;

import java.util.List;

public interface VehiclePark {
    int calculateTotalValue();
    List<Vehicle> sortByFuelConsumptionAsc();
    List<Vehicle> findVehiclesWithinMaxSpeedRange(int min, int max);
}
