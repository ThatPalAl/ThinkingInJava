package interfaces.examples.e11;

public class A {
    interface B{
        void f();
        interface BC {
            void f(int i);
        }
    }
    public class BImp implements B{
        public void f(){}
    }

    private class BImp2 implements B{
        public void f(){}
    }

    public interface C{
        void f();
    }

    class CImp implements C{
        public void f(){}
    }

    private class CImp2 implements C{
        public void f(){}
    }

    private interface D{
        void f();
    }

    private class DImp implements D{
        public void f(){}
    }

    private class DImp2 implements D{
        public void f(){}
    }

    public D getD(){
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d ){
        dRef = d;
        d.f();
    }
}

interface E {
    interface G{
        void f();
    }
    public interface H{ //public keyword not necessary
        void f();
    }
    void g();
    // you cant be private inside an interface:
    //!!! private interface I{}
}


