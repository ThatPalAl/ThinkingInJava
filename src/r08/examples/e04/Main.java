package r08.examples.e04;

public class Main {
    private void f(){
        System.out.println("private method f()");
    }
    public static void main(String[] args) {
        Main derived = new Derived();
        derived.f();
        Derived derived2 = new Derived();
        derived2.f();
    }
}

class Derived extends Main {
    public void f(){
        System.out.println("public method f()");
    }
}
