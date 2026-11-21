package dip.good;

public class OrderService {

    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService){
        this.notificationService=notificationService;
    }

    public void placeOrder(Order order){



        // Logic for placing the order

        System.out.println("Checking inventory");
        System.out.println("Added to cart");
        System.out.println("Payment Done");
        System.out.println("Order Placed");

        notificationService.sendNotification(order);
    }
}
