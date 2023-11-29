package exceptions.examples.e01;

import java.io.Console;

public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throwing exception 'SimpleException' from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try{
            sed.f();
        } catch (SimpleException e){
            System.out.println("Got him!");
        }

    }
}
