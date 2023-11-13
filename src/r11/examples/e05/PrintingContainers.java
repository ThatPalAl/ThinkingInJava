package r11.examples.e05;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("Rat");
        collection.add("Cat");
        collection.add("Dog");
        collection.add("Dog");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("Rat", "Ratata");
        map.put("Cat", "Micky");
        map.put("Dog", "Pat");
        map.put("Dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
        System.out.println(fill(new PriorityQueue<String>()));
    }
}
