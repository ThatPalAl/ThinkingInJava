package polymorphism.examples.e02;

public class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    public void erase(){
        System.out.println("Triangle.erase()");
    }
}
