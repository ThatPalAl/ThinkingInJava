package exceptions.c08;

import exceptions.c04.OwnException;

public class Exception8 {
    public static void main(String[] args) {
        try{
            SpecifyException test8 = new SpecifyException();
            test8.f();
        } catch (OwnException e ){
            System.out.println("Caught exception");
            e.printStackTrace();
            e.shout();
        }
    }
}
