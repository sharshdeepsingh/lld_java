package code.goodDesign;

public class Save10Discount implements DiscountPolicy {

    @Override
    public boolean supports(String couponCode) {
        return "SAVE10".equals(couponCode);
    }

    @Override
    public double calculateDiscount(double subTotal) {
        return subTotal*0.1;
    }
}
