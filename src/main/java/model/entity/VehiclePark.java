package model.entity;

import java.util.List;

public interface VehiclePark {
    int calculateTotalValue();
    List<Vehicle> sortByFuelConsumptionAsc();
    List<Vehicle> findCarsWithinGivenMaxSpeedRange(int min, int max);
}
