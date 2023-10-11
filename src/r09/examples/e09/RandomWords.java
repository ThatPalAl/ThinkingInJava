package r09.examples.e09;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
    private static Random rand = new Random(12);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPRSTUWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnoprstuwxyz".toCharArray();

    private static final char[] vowels = "aeiouy".toCharArray();

    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb){
        if(count-- == 0){
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i = 0; i < 4; i++){
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10; //number of added chars
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }

}
