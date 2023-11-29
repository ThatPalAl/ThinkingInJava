package polymorphism.examples.e08;

public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has got heart");
    private Description d = new Description("It's an animal (Animal), not a plant");

    Animal(){
        System.out.println("Animal()");
    }

    protected void dispose(){
        System.out.println("Removing animal");
        p.dispose();
        d.dispose();
        super.dispose();
    }

}
