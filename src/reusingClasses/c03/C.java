package reusingClasses.c03;

public class C extends A {
    private B b;

    public C() {
        b = new B();
    }

    public C(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
//        b = new B();
        return "c to string()";
    }
}
