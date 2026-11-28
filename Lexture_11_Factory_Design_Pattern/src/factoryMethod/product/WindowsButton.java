package factoryMethod.product;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendered using the WINDOWS");
    }
}
