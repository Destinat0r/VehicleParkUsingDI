package model.entity.impl;

import model.entity.Vehicle;
import model.entity.VehiclePark;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TaxiPark implements VehiclePark {

    private List<Vehicle> vehicles;

    public TaxiPark(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int calculateTotalValue() {
        return vehicles.stream().mapToInt(v -> v.value()).sum();
    }

    public List<Vehicle> sortByFuelConsumptionAsc() {
        return null;
    }

    public List<Vehicle> findCarsWithinGivenMaxSpeedRange(int min, int max) {
        return null;
    }
}
