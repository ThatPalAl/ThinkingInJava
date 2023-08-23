package r08.examples.e2;

import r07.c03.C;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random(3);
    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
