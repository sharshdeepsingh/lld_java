package stratigies.type;

public class AssassinType implements CharacterTypeStrategy{
    @Override
    public String getTypeName() {
        return "ASSASSIN TYPE";
    }

    @Override
    public void specialMove() {
        System.out.println("ASSASSIN killing silently");
    }
}
