package code.goodDesign;

public class MySQLOrderRepository implements IOrderRepository{
    @Override
    public Order save(double total, String email) {
        System.out.println("Order Saved to MySQL");

        return new Order(1,total,email);
    }
}
