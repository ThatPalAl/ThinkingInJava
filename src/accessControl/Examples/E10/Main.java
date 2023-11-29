package accessControl.Examples.E10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside main:");
        Cups.cup1.f(99);

        System.out.println("Spoons:");
//        new Spoons();
        Spoons.spoon1.f(30);
//        Spoons spoons = new Spoons();
//        Spoons.spoon2.f(20);
    }
    static Cups cups1 = new Cups();
    static Spoons spoons = new Spoons();
}
