package exceptions.examples.e01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String t = "null";
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println(scanner.next());
            if(scanner.next().equals(t)){
                System.out.println("Excecption thrown");
                throw new NullPointerException("t == null");
            }
        }

    }
}
