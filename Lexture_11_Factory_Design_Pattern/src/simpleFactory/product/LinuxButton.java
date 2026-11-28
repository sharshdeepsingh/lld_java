package simpleFactory.product;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Button in LINUX");
    }
}
