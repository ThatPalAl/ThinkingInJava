package r11.c08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Vegetable> veggies = new ArrayList<>();
        MexicanVeg pepper = new MexicanVeg(SpiceLevels.EXTREME, "Jalapeno pepper");
        PolishVeg potato = new PolishVeg(SpiceLevels.LIGHT, "Potato");
        PolishVeg ginger = new PolishVeg(SpiceLevels.MEDIUM, "Ginger");
        MexicanVeg onion = new MexicanVeg(SpiceLevels.HOT, "Red onion");
        veggies.add(pepper);
        veggies.add(potato);
        veggies.add(ginger);
        veggies.add(onion);

        Iterator<Vegetable> vegetableIt = veggies.iterator();
        while(vegetableIt.hasNext()){
            System.out.println(vegetableIt.next().showSpiceLevel() + "  " );

        }
    }
}
