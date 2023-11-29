package exceptions.examples.e02;

public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing exception 'MyException' from f()");
        throw new MyException();
    }

    public static void g() throws MyException{
        System.out.println("Throwing exception 'MyException' from g()");
        throw new MyException();
    }

    public static void main(String[] args) {
        try{
            System.out.println(System.err);
            f();
        } catch (MyException e){
            e.printStackTrace(System.out);
        }
        try{
            g();
        } catch (MyException e){
            e.printStackTrace(System.out);
        }
    }
}
