package r09.c01;

import java.util.Random;

public class Main {
    private static Random random = new Random(10);

    public static void eating(Rodent rodent){
        switch(random.nextInt(4)){
            case 1 -> rodent.eats(Food.FRUITS);
            case 2 -> rodent.eats(Food.BREAD);
            case 3 -> rodent.eats(Food.LEFTOVERS);
            default -> rodent.eats(Food.NOTHING);

        }
    }

    public static void feast(Rodent[] rodentsArray){
        for (Rodent r: rodentsArray) {
            eating(r);
        }

    }

    public static void main(String[] args) {
        Rodent[] trashCan = {new Hamster(), new Mouse(), new Rat()};
        feast(trashCan);
    }
}
