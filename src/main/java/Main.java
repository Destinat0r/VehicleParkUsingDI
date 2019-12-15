import model.entity.Vehicle;
import model.entity.VehiclePark;
import model.entity.impl.Car;
import model.entity.impl.TaxiPark;
import model.entity.impl.Truck;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car("Nissan", 400, 12, 23000, 4);
        Vehicle truck = new Truck("Toyota", 150, 25, 12000, 5000);


        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car);
        vehicleList.add(truck);

        VehiclePark taxiPark = new TaxiPark(vehicleList);
        System.out.println(taxiPark.calculateTotalValue());
        System.out.println(taxiPark.sortByFuelConsumptionAsc());
        System.out.println(taxiPark.findVehiclesWithinMaxSpeedRange(100, 200));
    }
}
