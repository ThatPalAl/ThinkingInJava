package r09.examples.e11;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        //no access to A.D
//        A.D ad = a.getD(); // cause D has private access

        //not returning anything except A.d:
//        A.DImp2 di2 = a.getD();
//        no access to the interface component:
//        a.getD().f();
        //only a different A object can do something with getD();
        A a2 = new A();
        a.receiveD(a.getD());
    }
}
