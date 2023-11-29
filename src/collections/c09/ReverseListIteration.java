package collections.c09;

import java.util.*;

public class ReverseListIteration {
    public static void main(String[] args) {
        Integer [] numbersTemplate = {1, 7, 3, 12, 19, 2, 14};
        List<Integer> numbers1 = Arrays.asList(numbersTemplate);
//      !!! LESS EFFICIENT APPROACH: !!!
//        for(Integer i : numbersTemplate){
//            numbers1.add(i);
//        }
        System.out.println(numbers1);

        List<Integer> numbers2 = new ArrayList<>(numbers1.size());
        ListIterator<Integer> numIterator = numbers1.listIterator(numbers1.size()); //declare what's the start point
        while(numIterator.hasPrevious()){
            numbers2.add(numIterator.previous());
        }
        System.out.println(numbers2);

        List<Integer> numbers3 = numbers2;
        Collections.reverse(numbers3);
        System.out.println(numbers3);

    }
}
