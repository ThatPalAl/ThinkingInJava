package r08.examples.e08;

public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description d = new Description("Water and land (Amphibian)");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("Removing Amphibian");
        p.dispose();
        d.dispose();
        super.dispose();
    }
}
