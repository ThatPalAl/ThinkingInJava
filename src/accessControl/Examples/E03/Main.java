package accessControl.Examples.E03;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower();
        flower1.printPetalCount();

        Flower flower2 = new Flower(15);
        flower2.printPetalCount();

        Flower flower3 = new Flower("string argument");
        flower3.printPetalCount();

        Flower flower4 = new Flower("Text", 4);
        flower4.printPetalCount();
        System.out.println("After changes");
    }
}
