package code.goodDesign;

public class CardPaymentProcessor implements PaymentProcessor{
    @Override
    public String method() {
        return "CARD PAYMENT";
    }

    @Override
    public void pay(double amount, String paymentDetail) {

        if (paymentDetail == null ||
                !paymentDetail.startsWith("card_")) {
            throw new IllegalArgumentException("Invalid card token");
        }

        System.out.println("Charging card: " + amount);

    }
}
