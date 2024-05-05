package behavioral.strategy.example.notification.implementation;

import behavioral.strategy.example.notification.interfaces.NotificationStrategy;

public class EmailNotificationStrategy extends NotificationStrategy {

    @Override
    public void sendNotification(String message) {
        System.out.println(" sending this message via email  "+message);
    }
}
