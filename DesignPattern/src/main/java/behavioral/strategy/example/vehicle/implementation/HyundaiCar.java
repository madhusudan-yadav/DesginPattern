package behavioral.strategy.example.vehicle.implementation;

import behavioral.strategy.example.vehicle.interfaces.DriveStrategy;
import behavioral.strategy.example.vehicle.interfaces.Vehicle;

public class HyundaiCar extends Vehicle {
    public HyundaiCar(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
