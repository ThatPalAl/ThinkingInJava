package r11.c21;

import java.util.*;

public class PositioningWord {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> resMap = new HashMap<>();
        String wordsStr ="Did I tell you about that crazy OPENAI stuff? " +
                "This new feature from OPENAI , really drives me crazy, cause for the first time ever, " +
                "you can actually verify your code straightaway. It's very simple, you only need to type in your " +
                "query, and it returns a result in few seconds. OPENAI did everything to make your life easier, " +
                "so why don't you try it out? Crazy stuff ooooo";

        int position = 1;
        HashMap<String, Integer> map = new HashMap<>();
        List<String> words = Arrays.asList(wordsStr.toLowerCase().split("\\W+"));
        System.out.println(words.size());
        for (String w: words) {
            map.put(w, position);
            position++;
        }
        System.out.println(map);

    }
}
