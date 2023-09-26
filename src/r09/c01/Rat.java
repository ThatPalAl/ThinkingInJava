package r09.c01;

public class Rat extends Rodent {

    public void bites() {
        System.out.println("Rat.bite()");
    }

    @Override
    public void eats(Food food) {
        System.out.println("Rat.eat(" + food + ")");
    }
}
