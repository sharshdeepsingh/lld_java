package dip.good;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification(Order o) {
        System.out.println("EMAIL Notification send to " + o.getEmail() + " for order number  "+o.getOrderNumber() );
    }
}
