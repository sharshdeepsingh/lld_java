package code.goodDesign;

import java.util.List;

public class SimplePriceCalculator implements IPriceCalculator{

    public double calculateSubTotal(List<CartItem> items){

        double subTotal=0;


        for(CartItem item: items){
            subTotal+= item.getQuantity()* item.getPrice();
        }

        return subTotal;

    }
}
