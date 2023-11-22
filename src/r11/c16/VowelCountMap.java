package r11.c16;

import java.util.*;

public class VowelCountMap {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<>();
        Collections.addAll(vowels,'A', 'E', 'I','O','U','Y');
        String wordsStr ="This new feature from OPENAI, really drives me crazy, cause for the first time ever," +
                "you can actually verify your code straightaway. It's very simple, you only need to type in your " +
                "query, and it returns a result in few seconds. OPENAI did everything to make your life easier, " +
                "so why don't you try it out? Crazy stuff ooooo";
        List<String> words = List.of(wordsStr.toLowerCase().split("\\s"));
        Map<Character, Integer> countEachVowel = new HashMap<>();
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        int countY = 0;
        for (String word: words) {
            int counter = 0;
            for(Character c : word.toCharArray()){
                if(vowels.contains(c)){
                    counter++;
                    switch (c){
                        case 'A':countA++;
                        case 'E':countE++;
                        case 'I':countI++;
                        case 'O':countO++;
                        case 'U':countU++;
                        case 'Y':countY++;
                        default:
                    }
                }
            }
            System.out.println(word + " number of vowels: " + counter);
        }
        countEachVowel.put('A', countA);
        countEachVowel.put('E', countE);
        countEachVowel.put('I', countI);
        countEachVowel.put('O', countO);
        countEachVowel.put('U', countU);
        countEachVowel.put('Y', countY);
        System.out.println("--------------------");
        System.out.println(countEachVowel);

    }
}