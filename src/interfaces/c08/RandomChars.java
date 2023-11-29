package interfaces.c08;

import java.util.Random;

public class RandomChars {
    //Exercise 16 - generate random char set using the Scanner and Readable format
    Random rand = new Random(47);
    public char next(){
        return (char)(rand.nextInt(128));
    }

    public static void main(String[] args) {
        RandomChars rc = new RandomChars();

    }
}
