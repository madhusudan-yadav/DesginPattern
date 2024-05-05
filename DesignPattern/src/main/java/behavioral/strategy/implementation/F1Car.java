package behavioral.strategy.implementation;

import behavioral.strategy.interfaces.DriveStrategy;
import behavioral.strategy.interfaces.Vehicle;

public class F1Car extends Vehicle {
    public F1Car(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    public void drive(){
        super.drive();
    }
}
