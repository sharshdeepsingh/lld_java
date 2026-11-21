package dip.bad;

public class OrderService {

    private String message;
    private String email;
    private String number;

//    public OrderService(String email,String message){
//        this.message=message;
//        this.email=email;
//    }

    // COnstructor change as well
    public OrderService(String number,String message){
        this.message=message;
        this.number=number;
    }

    public void placeOrder(){


//        EmailNotificationService ens= new EmailNotificationService();

//        For SMS Notifiction a lot of changes are required in the Low Level Design

        SMSNotificationService sns= new SMSNotificationService();

        // Logic for placing the order

        System.out.println("Checking inverntory");
        System.out.println("Added to cart");
        System.out.println("Payment Done");
        System.out.println("Order Placed");

//        ens.sendNotification(message,email);

        sns.sendSMSNotification(number,message);
    }
}
