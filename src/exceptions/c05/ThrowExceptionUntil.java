package exceptions.c05;

import exceptions.c04.OwnException;
import exceptions.examples.e02.MyException;

import java.util.Scanner;

public class ThrowExceptionUntil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        while(value < 20){
            try{
                if(input(value) == null){
                    throw new OwnException();
                }
                else{
                    input(value).shout();
                }
            } catch (OwnException e){
                System.out.println(e);
            }
            value++;
        }
    }

    public static OwnException input(int value) throws OwnException {
        if(value < 10){
            return new OwnException();
        }
        else {
            return null;
        }
    }
}
