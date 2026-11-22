package code.goodDesign;

public class CheckoutService {

    private final IPriceCalculator priceCalculator;
    private final DiscountCalculator discountCalculator;
    private final PaymentService paymentService;
    private final IOrderRepository orderRepository;
    private final IOrderNotifier orderNotifier;

    public CheckoutService(SimplePriceCalculator priceCalculator,
                           DiscountCalculator discountCalculator,
                           PaymentService paymentService,
                           IOrderRepository orderRepository,
                           EmailNotifier orderNotifier) {
        this.priceCalculator = priceCalculator;
        this.discountCalculator = discountCalculator;
        this.paymentService = paymentService;
        this.orderRepository = orderRepository;
        this.orderNotifier = orderNotifier;
    }

    public Order placeOrder(CheckoutRequest request){

        if(request==null || request.getItems()==null || request.getItems().isEmpty()){
            throw new IllegalArgumentException("Cart is empty");
        }

        // 1. calculate subTotal;
        double subtotal= priceCalculator.calculateSubTotal(request.getItems());

        //2. Apply Discount
        double discount = discountCalculator.calculateDiscount(request.getCouponCode(),subtotal);

        double total = Math.max(0, subtotal - discount);

        // 3. Process Payment
        paymentService.processPayment(request.getPaymentMethod(), request.getPaymentDetails(), total);

        // 4. save order
        Order order=orderRepository.save(total,request.getEmail());

        // 5. send confirmation
        orderNotifier.sendOrderConfirmation(order);

        return order;
    }


}
