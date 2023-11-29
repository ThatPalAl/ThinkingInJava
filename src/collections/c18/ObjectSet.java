package collections.c18;

import java.util.*;

public class ObjectSet {
    public static void main(String[] args) {
        String wordsStr ="Did I tell you about that crazy OPENAI stuff? " +
                "This new feature from OPENAI , really drives me crazy, cause for the first time ever, " +
                "you can actually verify your code straightaway. It's very simple, you only need to type in your " +
                "query, and it returns a result in few seconds. OPENAI did everything to make your life easier, " +
                "so why don't you try it out? Crazy stuff ooooo";
        List<String> wordsList = Arrays.asList(wordsStr.toLowerCase().split("\\s"));
        HashMap<String, Integer> countWords = new HashMap<>();
        Set<Word> words = new HashSet<>();

        System.out.println(wordsList);
        for(String word : wordsList){
            countWords.put(word, countWords.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String,Integer> entrySet : countWords.entrySet()){
            words.add(new Word(entrySet.getKey(), entrySet.getValue()));
        }
        System.out.println(words);

    }
}
