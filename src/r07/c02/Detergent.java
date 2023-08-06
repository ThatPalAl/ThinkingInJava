package r07.c02;

import r07.examples.e03.Cleanser;

public class Detergent extends r07.examples.e03.Cleanser {

    public Detergent() {
    }

    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam(){
        append(" foam()");

    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("Cleanser class: ");
        r07.examples.e03.Cleanser.main(args);
        //Everytime we create an object, from class Cleanser- it's going to start with a null value.
        r07.examples.e03.Cleanser cleanser = new Cleanser();
        cleanser.scrub();
        System.out.println(cleanser);

    }
}
