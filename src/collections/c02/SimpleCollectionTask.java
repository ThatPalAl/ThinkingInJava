package collections.c02;

import java.util.*;

public class SimpleCollectionTask {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for(int i = 0; i < 10; i++){
            c.add(i);
        }
        System.out.println(c.add(4)); //returns true if the value is added to a SET - in this case it isn't.
        for (Integer i: c) {
            System.out.print(i + ", ");
        }
    }
}
