package R05.Examples.E03;

public class Flower {
    int petalCount = 0;
    String s = "starting value";

    public Flower() {
        this("hey", 45);
        System.out.println("Default constructor, without arguments");
    }
    public Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor with one argument, Integer.");
    }

    public Flower(String ss) {
        System.out.println("constructor with just the String argument: ");
        this.s = ss;
    }

    public Flower(String s, int petals) {
        this(petals);
        //this(s);
        this.s = s;
        System.out.println("constructor with 2 arguments, String and Integer");
    }

    void printPetalCount(){
        System.out.println("petal Count: " + petalCount + " s: " + s);
    }

}
