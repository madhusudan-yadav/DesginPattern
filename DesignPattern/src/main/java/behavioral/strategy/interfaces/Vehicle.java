package behavioral.strategy.interfaces;

public abstract class Vehicle {
     DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
         this.driveStrategy = driveStrategy;
     }

    public void drive() {
        driveStrategy.drive();
    }
}
