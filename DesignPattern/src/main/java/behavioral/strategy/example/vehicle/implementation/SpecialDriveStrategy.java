package behavioral.strategy.example.vehicle.implementation;

import behavioral.strategy.example.vehicle.interfaces.DriveStrategy;

public class SpecialDriveStrategy extends DriveStrategy {
    @Override
    protected void drive() {
        System.out.println("specialized driving ");
    }
}
