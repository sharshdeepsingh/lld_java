package stratigies.type;

public class WarriorType implements CharacterTypeStrategy{
    @Override
    public String getTypeName() {
        return "Warrior Type";
    }

    @Override
    public void specialMove() {
        System.out.println("Killing with Warrior Powers");
    }
}
