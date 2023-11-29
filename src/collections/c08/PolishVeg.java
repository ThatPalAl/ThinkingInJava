package collections.c08;

public class PolishVeg implements Vegetable {

    private final SpiceLevels spiceLevel;
    private final String name;

    public PolishVeg(SpiceLevels spiceLevel, String name) {
        this.spiceLevel = spiceLevel;
        this.name = name;
    }

    @Override
    public String showSpiceLevel() {
        return name + ": " + spiceLevel.toString();
    }
    @Override
    public String toString() {
        return name;
    }
}
