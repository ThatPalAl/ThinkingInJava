package collections.c07;

import polymorphism.c02.Food;
import polymorphism.c02.Rodent;

public class RodentExt extends Rodent {

    private static int idCounter = 1;
    private final int id;
    private final String type;

    public RodentExt(String type) {
        this.type = type;
        this.id = idCounter++;
    }

    @Override
    public void bites() {
        super.bites();
    }

    @Override
    public void eats(Food food) {
        super.eats(food);
    }

    @Override
    public String toString() {
        return  id + " " + type;
    }
}
