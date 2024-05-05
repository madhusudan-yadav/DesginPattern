package behavioral.strategy.example.notification.implementation;

import behavioral.strategy.example.notification.interfaces.EventNotification;
import behavioral.strategy.example.notification.interfaces.NotificationStrategy;

public class SpamEmailEvent extends EventNotification {
    public SpamEmailEvent(NotificationStrategy notificationStrategy) {
        super(notificationStrategy);
    }

    public void sendNotification(String message){
        super.sendNotification(message);
    }
}
