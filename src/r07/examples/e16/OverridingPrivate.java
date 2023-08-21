package r07.examples.e16;

public class OverridingPrivate extends ClassWithFinals {
    private final void f(){
        System.out.println("OverridingPrivate class method.f()");
    }

    private void g(){
        System.out.println("OverridingPrivate class method g()");
    }
}
