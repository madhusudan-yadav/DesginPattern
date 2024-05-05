package behavioral.strategy.implementation;

import behavioral.strategy.interfaces.DriveStrategy;
import behavioral.strategy.interfaces.Vehicle;

public class HyundaiCar extends Vehicle {
    public HyundaiCar(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
