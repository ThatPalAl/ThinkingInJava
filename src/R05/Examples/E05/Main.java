package R05.Examples.E05;

public class Main {
    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();

        Measurement measurement = new Measurement();
        Depth depth = new Depth();
//        Depth depth;
        measurement.print(depth);
    }
}
