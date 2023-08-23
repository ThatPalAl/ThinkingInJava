package r08.c02;

public class Mouse extends Rodent {

    public void bites() {
        System.out.println("Mouse.bite()");
    }

    @Override
    public void eats(Food food) {
        System.out.println("Mouse.eat(" + food + ")");
    }
}
