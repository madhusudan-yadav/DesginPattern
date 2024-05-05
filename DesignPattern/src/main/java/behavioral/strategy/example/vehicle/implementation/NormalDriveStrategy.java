package behavioral.strategy.example.vehicle.implementation;

import behavioral.strategy.example.vehicle.interfaces.DriveStrategy;

public class NormalDriveStrategy extends DriveStrategy {
    @Override
    protected void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
