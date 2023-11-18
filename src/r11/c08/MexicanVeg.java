package r11.c08;

public class MexicanVeg implements Vegetable {

    private final SpiceLevels spiceLevel;
    private final String name;

    public MexicanVeg(SpiceLevels spiceLevel, String name) {
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
