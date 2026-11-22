package code.goodDesign;



import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements IOrderRepository {

    private final Map<Integer, Order> orders = new HashMap<>();
    private int nextId = 1;

    public Order save(double amount, String email){
        // Step 4: Save order
        Order order = new Order(nextId++, amount, email);
        orders.put(order.getId(), order);

        System.out.println("Order saved: " + order.getId());

        // Step 5: Send confirmation
        System.out.println("Sending confirmation email to: " +email);

        return order;
    }

    public Order find(int orderId) {
        return orders.get(orderId);
    }


}

