package r07.examples.e16;

public class Main {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op = op2;
//        op.f();
//        op.g();
        ClassWithFinals cwf = new ClassWithFinals();
//        cwf.f();
//        cwf.g();

    }
}
