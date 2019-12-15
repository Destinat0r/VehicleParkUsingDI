import model.entity.Vehicle;
import model.entity.impl.Car;
import model.entity.impl.Truck;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car("Nissan", 400, 12, 23000, 4);
        Vehicle truck = new Truck("Toyota", 150, 25, 12000, 5000);


    }
}
