package behavioral.strategy.example.vehicle.implementation;

import behavioral.strategy.example.vehicle.interfaces.Vehicle;
import behavioral.strategy.example.vehicle.interfaces.DriveStrategy;

public class F1Car extends Vehicle {
    public F1Car(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    public void drive(){
        super.drive();
    }
}
