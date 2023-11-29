package exceptions.c01;

import exceptions.examples.e02.MyException;

public class Main {
    public static void main(String[] args) {
        String value = "Example of a value";
        try{
            if (value.toLowerCase().contains("x")) {
                throw new MyException(value);
            }
        } catch (MyException e){
            System.out.println(value);
        }
        finally {
            System.out.println("That would happen anyway");
        }
    }
}
