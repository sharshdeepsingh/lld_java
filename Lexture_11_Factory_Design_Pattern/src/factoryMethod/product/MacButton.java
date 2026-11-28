package factoryMethod.product;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendered using the MAC");
    }
}
