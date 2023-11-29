package reusingClasses.c03;

public class Main {
    public static void main(String[] args) {
        C c1 = new C();
        System.out.println(c1);

        System.out.println("-------------------------------------------------------");
        C c2 = new C(new B());
        System.out.println(c2);

    }
}
