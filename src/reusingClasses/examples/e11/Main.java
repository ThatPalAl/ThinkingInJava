package reusingClasses.examples.e11;

public class Main {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.5f);
        b.doh(new Milhouse());
    }
}
