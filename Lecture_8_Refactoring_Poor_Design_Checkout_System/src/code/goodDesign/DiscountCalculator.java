package code.goodDesign;

import java.util.ArrayList;
import java.util.List;

public class DiscountCalculator {

    private final List<DiscountPolicy> policies;

    public DiscountCalculator(List<DiscountPolicy> policies) {
        this.policies = new ArrayList<>(policies);
    }

    public double calculateDiscount(String couponCode
    , double subtotal){

        for(DiscountPolicy policy: policies){
            if(policy.supports(couponCode)){
                return policy.calculateDiscount(subtotal);
            }
        }


        return 0;
    }

}
