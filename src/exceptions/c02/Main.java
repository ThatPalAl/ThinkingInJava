package exceptions.c02;

import exceptions.examples.e02.MyException;

public class Main {
    public static void main(String[] args) {
        String s = null;
        try {
            s.equals('x');
        } catch (NullPointerException e){
            System.out.println("value is null");
        }
    }
}
