package behavioral.strategy.example.notification.interfaces;

public abstract class EventNotification {

    NotificationStrategy notificationStrategy;
    public EventNotification(NotificationStrategy notificationStrategy){
        this.notificationStrategy = notificationStrategy;

    }

    public void sendNotification(String message){
        this.notificationStrategy.sendNotification(message);
    }
}
