package behavioral.strategy.implementation;

import behavioral.strategy.interfaces.DriveStrategy;
import behavioral.strategy.interfaces.Vehicle;

public class Truck extends Vehicle {

    public Truck(DriveStrategy driveStrategy){
        super(driveStrategy);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
