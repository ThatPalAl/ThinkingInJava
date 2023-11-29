package polymorphism.c03;

public class BaseClass {
    public void f(){
        System.out.println("f() in BaseClass");
    }

    public void g(){
        f();
        System.out.println("g() in BaseClass");
    }
}
