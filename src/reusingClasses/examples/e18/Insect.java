package reusingClasses.examples.e18;

import java.util.Random;

public class Insect {
    private int i = 0;
    protected int j;
    private int y = printInit("Insect class constructor");

    public Insect() {
        System.out.println(y);
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialised");

    static int printInit(String s){
        System.out.println(s);
        Random rand = new Random(20);
        return rand.nextInt(50);
    }
}
