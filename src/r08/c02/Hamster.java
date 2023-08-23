package r08.c02;

public class Hamster extends Rodent {

    public void bites() {
        System.out.println("Hamster.bite()");
    }

    @Override
    public void eats(Food food) {
        System.out.println("Hamster.eat(" + food + ")");
    }
}
