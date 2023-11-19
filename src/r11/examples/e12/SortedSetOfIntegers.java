package r11.examples.e12;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfIntegers {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> integerSet = new TreeSet<>();
        for(int i = 0; i < 1000; i++){
            integerSet.add(rand.nextInt(30));
        }
        System.out.println(integerSet);
    }
}
