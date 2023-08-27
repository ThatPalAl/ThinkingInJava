package r08.examples.e08;

public class LivingCreature {
    private Characteristic p = new Characteristic("lives");
    private Description d = new Description("living creature (LivingCreate)");

    LivingCreature(){
        System.out.println("LivingCreature()");
    }

    protected void dispose(){
        System.out.println("removing (LivingCreature)");
        p.dispose();
        d.dispose();
    }
}

