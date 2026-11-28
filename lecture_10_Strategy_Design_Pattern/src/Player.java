import stratigies.attack.AttackStrategy;
import stratigies.fly.FlyStrategy;
import stratigies.type.CharacterTypeStrategy;

public class Player {

    private String name;
    private AttackStrategy attackStrategy;
    private CharacterTypeStrategy typeStrategy;
    private FlyStrategy flyStrategy;

    public Player(String name, AttackStrategy attackStrategy,
                  CharacterTypeStrategy typeStrategy,
                  FlyStrategy flyStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.typeStrategy = typeStrategy;
        this.flyStrategy = flyStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setTypeStrategy(CharacterTypeStrategy typeStrategy) {
        this.typeStrategy = typeStrategy;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void showStatus(){
        System.out.println("Plaer: "+ name + " | Type: "+ typeStrategy.getTypeName());
    }

    public void attack(){
        System.out.println(name +" : attacks ");
        attackStrategy.attack();
    }

    public void fly(){
        System.out.println(name + " : attempts to fly");
        flyStrategy.fly();
    }
}
