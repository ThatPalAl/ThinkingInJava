package polymorphism.c03;

public class DerivativeClass extends BaseClass {

    @Override
    public void f() {
        System.out.println("f() in DerivativeClass");
        super.f();
    }

//    @Override
//    public void g() {
//        super.g();
//    }
}
