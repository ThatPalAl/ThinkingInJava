package r11.c05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeaturesString {
    public static void main(String[] args) {
        Random rand = new Random(48);
        List<String> text = new ArrayList<>();
        String s1 = new String("One");
        String s2 = new String("Two");
        String s3 = new String("Three");
        text.add("Uno");
        text.add("Dos");
        text.add("Tres");
        text.add(s1);
        text.add(s2);
        System.out.println(text.contains("one"));
        System.out.println(text.contains("Uno"));
        System.out.println(text);
        System.out.println(text.get(2));
        List<String> sub = text.subList(1,4);
        System.out.println(sub);
        Collections.shuffle(sub);
        System.out.println(sub);
        List<String> copy = new ArrayList<>(text);
        System.out.println(copy);
        copy.add(s3);
        System.out.println("copy: " + copy);
        sub.retainAll(copy);
        System.out.println(copy);
        System.out.println(sub);
        Object[] objects = text.toArray();
        System.out.println("objects: " + objects[1].toString());
        String[] strArray = text.toArray(new String[2]);
        for(String s : strArray){
            System.out.println(s);
        }

    }
}
