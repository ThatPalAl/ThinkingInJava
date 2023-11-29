package collections.c15;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FillSetContainers {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        int[] arr = {7,1,3,5,6,7,2,1,10};
        for(int i : arr){
            numbers.add(i);
        }
        System.out.println(numbers);

        LinkedHashSet<Integer> linkedNumbers = new LinkedHashSet<>();
        for(int i : arr){
            linkedNumbers.add(i);
        }
        System.out.println(linkedNumbers);

    }
}
