package code.goodDesign;

public class UPIPaymentProcessor implements PaymentProcessor{
    @Override
    public String method() {
        return "UPI";
    }

    @Override
    public void pay(double amount, String details) {

            if (details == null ||
                    !details.contains("@")) {
                throw new IllegalArgumentException("Invalid UPI ID");
            }

            System.out.println("Collecting UPI payment: " + amount);

        }
}
