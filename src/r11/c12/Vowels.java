package r11.c12;

import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<>();
        Collections.addAll(vowels,'A', 'E', 'I','O','U','Y', 'a','e','i','o','u','y');
        String wordsStr ="This new feature from OPENAI, really drives me crazy, cause for the first time ever," +
                "you can actually verify your code straightaway. It's very simple, you only need to type in your " +
                "query, and it returns a result in few seconds. OPENAI did everything to make your life easier, " +
                "so why don't you try it out? Crazy stuff";
        List<String> words = List.of(wordsStr.split("\\s"));
        System.out.println(words);
        int countAll=0;
        for (String word: words) {
            int counter = 0;
            for(Character c : word.toCharArray()){
                if(vowels.contains(c)){
                    counter++;
                    countAll++;
                }
            }
            System.out.println(word + " number of vowels: " + counter);
        }
        System.out.println("Number of all vowels within that text: " + countAll);

    }
}