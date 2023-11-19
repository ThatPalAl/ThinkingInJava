package r11.examples.e12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfIntegers {
    public static void main(String[] args) {
        Random rand = new Random(31);
        Set<Integer> integers = new HashSet<>(1000);
        for(int i = 0; !integers.contains(49); i++){
            integers.add(rand.nextInt(50));
        }
        System.out.println(integers);
    }
}
