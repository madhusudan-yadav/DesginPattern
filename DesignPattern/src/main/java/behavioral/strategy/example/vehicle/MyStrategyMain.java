package behavioral.strategy.example.vehicle;

import behavioral.strategy.example.vehicle.implementation.HyundaiCar;
import behavioral.strategy.example.vehicle.implementation.NormalDriveStrategy;
import behavioral.strategy.example.vehicle.implementation.SpecialDriveStrategy;
import behavioral.strategy.example.vehicle.implementation.Truck;
import behavioral.strategy.example.vehicle.interfaces.Vehicle;

public class MyStrategyMain {

    public static void main(String[] args) {
        Vehicle vehicleTruck = new Truck(new NormalDriveStrategy());
        vehicleTruck.drive();

        Vehicle vehicleHyundaiCar = new HyundaiCar(new NormalDriveStrategy());
        vehicleHyundaiCar.drive();

        Vehicle f1SuperCar = new Truck(new SpecialDriveStrategy());
        f1SuperCar.drive();
    }
}
