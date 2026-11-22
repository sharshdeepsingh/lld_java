package code.goodDesign;

public interface IOrderRepository {

    Order save(double total, String email);

}
