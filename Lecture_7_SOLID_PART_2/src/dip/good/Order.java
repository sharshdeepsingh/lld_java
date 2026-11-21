package dip.good;

public class Order {

    private String email;
    private String orderNumber;
    private String phoneNumber;

    public Order(String email, String orderNumber, String phoneNumber) {
        this.email = email;
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
