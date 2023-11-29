package accessControl.Examples.E10;

public class Spoons {
    static Spoon spoon1;
    static Spoon spoon2;

    static {
        spoon1 = new Spoon(1);
    }
    static {
        spoon2 = new Spoon(2);
    }

    public Spoons() {
        System.out.println("Spoons Constructor");
    }
}
