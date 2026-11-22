package code.goodDesign;

public interface DiscountPolicy {


    boolean supports(String couponCode);

    double calculateDiscount(double subTotal);



}
