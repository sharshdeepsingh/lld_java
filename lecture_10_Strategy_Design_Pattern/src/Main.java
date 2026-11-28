import stratigies.fly.FlyWithJet;
import stratigies.fly.NoFlyWay;
import stratigies.type.WarriorType;
import stratigies.attack.BowAttack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player alex= new Player("Alex",new stratigies.attack.SwordAttack() ,new WarriorType(), new NoFlyWay());

        System.out.println("----Level 1 : Starting character");
        alex.showStatus();
        alex.attack();
        alex.fly();

        System.out.println("\n--- Level 2: Equipment upgrade");
        alex.setAttackStrategy(new stratigies.attack.BowAttack());
        alex.setFlyStrategy(new FlyWithJet());

        alex.showStatus();
    }
}