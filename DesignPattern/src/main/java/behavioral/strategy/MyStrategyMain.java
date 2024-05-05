package behavioral.strategy;

import behavioral.strategy.implementation.HyundaiCar;
import behavioral.strategy.implementation.NormalDriveStrategy;
import behavioral.strategy.implementation.SpecialDriveStrategy;
import behavioral.strategy.implementation.Truck;
import behavioral.strategy.interfaces.Vehicle;

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
