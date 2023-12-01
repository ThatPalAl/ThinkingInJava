package exceptions.c08;

import exceptions.c04.OwnException;

public class SpecifyException {
    public static void f() throws OwnException {
        System.out.println("f()");
        throw  new OwnException("Ouch from f()");
    }
}
