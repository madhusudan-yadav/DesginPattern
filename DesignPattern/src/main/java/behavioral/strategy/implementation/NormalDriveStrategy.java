package behavioral.strategy.implementation;

import behavioral.strategy.interfaces.DriveStrategy;

public class NormalDriveStrategy extends DriveStrategy {
    @Override
    protected void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
