package stratigies.fly;

public class FlyWithJet implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Jet used to fly");
    }
}
