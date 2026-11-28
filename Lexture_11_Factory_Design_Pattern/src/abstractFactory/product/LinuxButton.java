package abstractFactory.product;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendered Button: LINUX");

    }
}
