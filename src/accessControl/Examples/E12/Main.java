package accessControl.Examples.E12;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        a1[3] = 45;
        System.out.println("a1:");
        for (int i: a1) {
            System.out.print(i + " ");
        }
        System.out.println("\na2:");
        for (int i: a2) {
            System.out.print(i + " ");
        }
        System.out.println();

        String text = "text";
        String text2 = text;

        text2 = "New test";
        System.out.println(text);
        System.out.println(text2);

        int[] a3;
        Random random = new Random();
        a3 = new int[random.nextInt(47)];
        System.out.println("a3 length " + a3.length);
        for(int i = 0; i < a3.length; i++){
            a3[i] = random.nextInt(20);
            System.out.print(a3[i] + " ");
        }

        char[] a4;
        Random random1 = new Random();
        a4 = new char[random1.nextInt(45)];
        System.out.println("\na4 length: " + a4.length);
        for(int i = 0; i < a4.length; i++){
            a4[i] = (char) random.nextInt(100);
            System.out.print(a4[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a4));

        Random rand = new Random(47);
        Integer[] a5 = new Integer[rand.nextInt(20)];
        System.out.println("a size : " + a5.length);
        for(int i = 0; i < a5.length; i++){
            a5[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(a5));
    }
}
