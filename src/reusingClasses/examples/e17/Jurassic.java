package reusingClasses.examples.e17;

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur();
        dinosaur.f();
        System.out.println(dinosaur.i);
        System.out.println(dinosaur.j);
        dinosaur.i++;
//        dinosaur.j++;
        Dinosaur dinosaur1 = new Dinosaur(dinosaur.i, new SmallBrain());
        System.out.println(dinosaur1.i);
        System.out.println(dinosaur1.j);
        dinosaur1.f();
    }
}
