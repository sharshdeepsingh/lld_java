package code.goodDesign;

public interface PaymentProcessor {

    String method();
    void pay(double amount, String paymentDetail );
}
