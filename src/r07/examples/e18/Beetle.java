package r07.examples.e18;

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialised");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialised");

    public static void main(String[] args) {
        System.out.println("Beetle's class constructor");
        Beetle b = new Beetle();
    }
}
