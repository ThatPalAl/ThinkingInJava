package r08.examples.e08;

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("croaks");
    private Description d = new Description("insectivorous");

    public Frog() {
        System.out.println(p + " description: " + d);
        System.out.println("Frog()");
    }

    protected void dispose(){
        System.out.println("Removing Frog");
        p.dispose();
        d.dispose();
        super.dispose();
    }
}
