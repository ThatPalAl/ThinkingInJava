package r07.examples.e10;

public class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
        System.out.println("Triangle class constructor");
    }

    @Override
    void Dispose() {
        System.out.println("Removing the Triangle");
        super.Dispose();
    }
}
