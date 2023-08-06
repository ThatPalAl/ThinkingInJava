package r07.c04;

import r07.c03.A;
import r07.c03.B;

public class C extends A {
    private B b;

    public C() {
        b = new B();
        System.out.println(b);
    }

    public C(B b) {
        this.b = b;
    }



    @Override
    public String toString() {
        b = new B();
        return "c to string()";
    }
}
