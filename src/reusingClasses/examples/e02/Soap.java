package reusingClasses.examples.e02;

public class Soap {
    private String s;

    public Soap() {
        System.out.println("Soap()");
        s = "created";
    }

    @Override
    public String toString() {
        return s;
    }
}
