package code.goodDesign;

import java.util.List;

public interface IPriceCalculator {
    double calculateSubTotal(List<CartItem> items);
}
