package r07.examples.e05;

public class Chess extends BoardGame {
    public Chess() {
        super(11);
        System.out.println("Chess class constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }

}
