package r11.c20;

import java.util.*;

public class ExtractSpecificPair {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Ten", 10);
        map.put("Nine", 9);
        map.put("Eight", 8);
        map.put("Seven", 7);
        map.put("Six", 6);
        map.put("Five", 5);
        map.put("Four", 4);
        map.put("Three", 3);
        map.put("Two", 2);
        map.put("One", 1);

        System.out.println(map);
        Set<String> ss = new TreeSet<>(map.keySet());

        System.out.println(ss);
        //tmp map
        Map<String, Integer> mTemp = new LinkedHashMap<>();
        Iterator<String> itss = ss.iterator();
        while(itss.hasNext()){
            String s = itss.next();
            System.out.println("s: " + s);
            Integer i = map.get(s);
            System.out.println("i: " + i);
            map.remove(s);
            System.out.println("map after s removal : " + map);
            mTemp.put(s, i);
            System.out.println("mTemp after put(s,i)" + mTemp);
        }

        System.out.println("--------------------");
        Set<String> ssTemp = new TreeSet<>(mTemp.keySet());
        System.out.println("ssTemp before " + ssTemp);
        Iterator<String> ssIterator = ssTemp.iterator();
        while(ssIterator.hasNext()){
            String s = ssIterator.next();
            System.out.println("s : " + s);
            Integer i = mTemp.get(s);
            System.out.println("i : " + i);
            mTemp.remove(s);
            System.out.println("mTemp after removal :" + mTemp);
            map.put(s, i);
            System.out.println("map after put(s,i)" + map);
        }

    }
}
