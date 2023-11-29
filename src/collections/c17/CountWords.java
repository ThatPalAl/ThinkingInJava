package collections.c17;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        String wordsStr ="Did I tell you about that crazy OPENAI stuff? " +
                "This new feature from OPENAI , really drives me crazy, cause for the first time ever, " +
                "you can actually verify your code straightaway. It's very simple, you only need to type in your " +
                "query, and it returns a result in few seconds. OPENAI did everything to make your life easier, " +
                "so why don't you try it out? Crazy stuff ooooo";
        List<String> wordsList = Arrays.asList(wordsStr.toUpperCase().split("\\s"));
        Set<String> words = new HashSet<>(Arrays.asList(wordsStr.split(",.\\s")));
        HashMap<String, Integer> countWords = new HashMap<>(words.size());


        System.out.println(wordsList);
        for(String word : wordsList){
            countWords.put(word, countWords.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String,Integer> entrySet : countWords.entrySet()){
            System.out.println(entrySet.getKey() + ": " + entrySet.getValue());
        }
    }
}
