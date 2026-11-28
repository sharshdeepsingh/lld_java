package stratigies.type;

public class KnightType implements CharacterTypeStrategy{
    @Override
    public String getTypeName() {
        return "KNIGHT TYPE";
    }

    @Override
    public void specialMove() {
        System.out.println("Using the KNight Powers now");
    }
}
