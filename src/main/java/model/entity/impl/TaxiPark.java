package model.entity.impl;

import model.entity.Vehicle;
import model.entity.VehiclePark;

import java.util.*;
import java.util.stream.Collectors;

public class TaxiPark implements VehiclePark {

    private List<Vehicle> vehicles;

    public TaxiPark(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int calculateTotalValue() {
        return !vehicles.isEmpty() ? vehicles.stream().mapToInt(Vehicle::value).sum() : 0;
    }

    public List<Vehicle> sortByFuelConsumptionAsc() {
        List<Vehicle> sorted = new ArrayList<>(vehicles);
        sorted.sort(Comparator.comparingInt(Vehicle::fuelConsumption));
        return sorted;
    }

    public List<Vehicle> findVehiclesWithinMaxSpeedRange(int min, int max) {
        return vehicles.stream()
                       .filter(x -> x.maxSpeed() >= min && x.maxSpeed() <= max)
                       .collect(Collectors.toList());
    }

}
