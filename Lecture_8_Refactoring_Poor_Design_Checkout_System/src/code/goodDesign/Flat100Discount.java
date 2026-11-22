package code.goodDesign;

public class Flat100Discount implements DiscountPolicy{
    @Override
    public boolean supports(String couponCode) {
        return "FLAT100".equals(couponCode);
    }

    @Override
    public double calculateDiscount(double subTotal) {
        return subTotal-100;
    }
}
