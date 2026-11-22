package code.goodDesign;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // REGISTER AVAILABLE DISCOUNT POLICIES
        List<DiscountPolicy> discounts= Arrays.asList(
                new Save10Discount(),
                new Flat100Discount()
        );

        // REGISTER THE AVAILABLE PAYMENT PROCESSORS
        List<PaymentProcessor> payments= Arrays.asList(
                new CardPaymentProcessor(),
                new UPIPaymentProcessor()
        );

        IOrderRepository orderRepository= new InMemoryOrderRepository();

        CheckoutService checkoutService= new CheckoutService(
                new SimplePriceCalculator(),
                new DiscountCalculator(discounts),
                new PaymentService(payments),
                orderRepository,
                new EmailNotifier()
        );

        List<CartItem> items= Arrays.asList(
                new CartItem("Keyboard",1500,1),
                new CartItem("Mouse", 700,2)
        );

        // ORIGINAL CHECKOUT : same result after all refactorings
        CheckoutRequest firstRequest= new CheckoutRequest(items,"SAVE10",
                "UPI",
                "rahul@upi",
                "rahul@example.com");

        Order firstOrder = checkoutService.placeOrder(firstRequest);
        System.out.println("Order placed "+ firstOrder.getId());
        System.out.println("Final amount :" + firstOrder.getTotal());

    }
}