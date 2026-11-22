package code.goodDesign;

public class EmailNotifier implements  IOrderNotifier{

    public Order sendOrderConfirmation(Order order){
        // Step 5: Send confirmation
        System.out.println("Sending confirmation email to: " + order.getEmail());

        return order;
    }
}
