package collections.c04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeaturesInt {
    public static void main(String[] args) {
        Random rand = new Random(48);
        List<Integer> numbers = new ArrayList<>();
        Integer int1 = 10;
        Integer int2 = 15;
        Integer int3 = 20;
        Integer int4 = 25;
        Integer int5 = 30;
        Integer int6 = 35;
        Integer int7 = 40;

        numbers.add(int1);
        System.out.println(numbers.contains(int1));
        System.out.println(numbers.contains(10));
        numbers.add(10);
        System.out.println(numbers);
        numbers.add(int2);
        numbers.add(int3);
        System.out.println(numbers.get(3));
        System.out.println(numbers.isEmpty());
        numbers.add(int4);
        numbers.add(int5);
        List<Integer> sub = numbers.subList(1,4);
        System.out.println("sub :" +  sub);
        System.out.println("numbers: " + numbers);
        System.out.println(sub.contains(23));
        System.out.println(sub.contains(25));
        Collections.shuffle(sub);
        System.out.println("sub after shuffle: " + sub);
        List<Integer> copy = new ArrayList<>(numbers);
        System.out.println("copy: " + copy);
        Object[] oNum = numbers.toArray();
        System.out.println("Object: " + oNum[2]);
        Integer[] intArray = numbers.toArray(new Integer[25]);
        System.out.println(intArray[5]);
        intArray[24] = 100;
        System.out.println("int array: ");
        for(Integer i : intArray){
            System.out.print(i + " ");
        }



    }
}
