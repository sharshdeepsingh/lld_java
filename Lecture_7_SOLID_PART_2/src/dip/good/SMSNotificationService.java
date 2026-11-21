package dip.good;

public class SMSNotificationService implements NotificationService{

    @Override
    public void sendNotification(Order o) {
        System.out.println("SMS Notification send to " + o.getPhoneNumber() +
                " for order number  "+o.getOrderNumber() );
    }
}
