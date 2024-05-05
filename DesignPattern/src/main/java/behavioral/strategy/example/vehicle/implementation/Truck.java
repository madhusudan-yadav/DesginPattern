package behavioral.strategy.example.vehicle.implementation;

import behavioral.strategy.example.vehicle.interfaces.DriveStrategy;
import behavioral.strategy.example.vehicle.interfaces.Vehicle;

public class Truck extends Vehicle {

    public Truck(DriveStrategy driveStrategy){
        super(driveStrategy);
    }

    @Override
    public void drive() {
        super.drive();
    }
}
