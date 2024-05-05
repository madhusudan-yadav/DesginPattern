package behavioral.strategy.implementation;

import behavioral.strategy.interfaces.DriveStrategy;

public class SpecialDriveStrategy extends DriveStrategy {
    @Override
    protected void drive() {
        System.out.println("specialized driving ");
    }
}
