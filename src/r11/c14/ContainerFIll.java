package r11.c14;

import java.util.*;

public class ContainerFIll {
    public static void main(String[] args) {
        HashMap<Integer, String> numLet = new HashMap<>();
        numLet.put(2, "Two");
        numLet.put(1, "One");
        numLet.put(6, "Six");
        numLet.put(4, "Four");
        numLet.put(5, "Five");
        numLet.put(3, "Three");

        System.out.println(numLet);
        //Declare Data structures
        List<Integer> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();
        //Fill them with values
        numbers.addAll(numLet.keySet());
        words.addAll(numLet.values());
        System.out.println(numbers);
        System.out.println(words);
        //Reversing order - just for fun
        Collections.reverse(numbers);
        Collections.reverse(words);
        //Create iterator:
        ListIterator<Integer> numIterator = numbers.listIterator();
        ListIterator<String> wordIterator = words.listIterator();
        //Create LinkedHashmap - assign values to it using iterator
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Twelve", 12);
        while(numIterator.hasNext() && wordIterator.hasNext()){
            linkedHashMap.put(wordIterator.next(),numIterator.next());
        }
        linkedHashMap.put("Eight", 8);
        System.out.println(linkedHashMap);

    }
}
