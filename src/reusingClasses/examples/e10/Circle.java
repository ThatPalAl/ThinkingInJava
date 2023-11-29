package reusingClasses.examples.e10;

public class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("Circle class constructor");
    }

    @Override
    void Dispose() {
        System.out.println("Removing the Circle");
        super.Dispose();
    }
}
