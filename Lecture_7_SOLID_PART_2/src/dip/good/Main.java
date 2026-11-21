package dip.good;

public class Main {
    public static void main(String[] args) {

        Order order= new Order("customer@gmail.com ", "ORD-101","9543219039");

NotificationService  ns= new EmailNotificationService();

OrderService os= new OrderService(ns);

os.placeOrder(order);
    }
}
