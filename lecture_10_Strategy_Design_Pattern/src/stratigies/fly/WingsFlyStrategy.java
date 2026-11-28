package stratigies.fly;

public class WingsFlyStrategy implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Open Wings and Fly");
    }
}
