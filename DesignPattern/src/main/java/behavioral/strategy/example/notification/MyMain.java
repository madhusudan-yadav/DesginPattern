package behavioral.strategy.example.notification;

import behavioral.strategy.example.notification.implementation.EmailNotificationStrategy;
import behavioral.strategy.example.notification.implementation.MobileNotificationStrategy;
import behavioral.strategy.example.notification.implementation.SendOTPEventNotification;
import behavioral.strategy.example.notification.implementation.SpamEmailEvent;
import behavioral.strategy.example.notification.interfaces.EventNotification;

import java.util.Random;

public class MyMain {

    public static void main(String[] args) {
        EventNotification spam = new SpamEmailEvent(new EmailNotificationStrategy());
        spam.sendNotification("trial by combat");

        EventNotification otp = new SendOTPEventNotification(new MobileNotificationStrategy());
        int number = new Random().nextInt(100000);
        otp.sendNotification(String.valueOf(number));
    }
}
