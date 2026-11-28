package stratigies.fly;

public class NoFlyWay implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Flying powers disabled");
    }
}
