package R05.Examples.E11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inside main:");
        new Mugs();
        System.out.println("new Mugs()- finished");
        new Mugs(2);
        Mugs mugs1 = new Mugs();
        mugs1.mug2.f(5);
    }
}
