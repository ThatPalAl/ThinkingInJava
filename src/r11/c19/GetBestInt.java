package r11.c19;

import java.util.*;

public class GetBestInt {
    public static int genRandoms(int seed) {
        Random rand = new Random(seed);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);

        }
        System.out.println(map);
        int max = 0;
        for (Integer i : map.values()) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
        Set<Map.Entry<Integer, Integer>> me = new LinkedHashSet<Map.Entry<Integer, Integer>>(map.entrySet());
        int maxKey = 0;
        Iterator<Map.Entry<Integer, Integer>> it = me.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> findMax = it.next();
            if (findMax.getValue() == max) {
                maxKey = findMax.getKey();
            }

        }
        return maxKey;
    }
    public static void main(String[] args) {
        System.out.println("Max key is : " + genRandoms(47));
        System.out.println("Max key is : " + genRandoms(48));
    }
}
