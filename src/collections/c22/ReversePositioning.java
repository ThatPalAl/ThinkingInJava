package collections.c22;


import java.util.*;

public class ReversePositioning {
    public static void main(String[] args) {
        String wordsStr ="Did I tell you about that crazy OPENAI stuff? " +
                "This new feature from OPENAI , really drives me crazy, cause for the first time ever, " +
                "you can actually verify your code straightaway. It's very simple, you only need to type in your " +
                "query, and it returns a result in few seconds. OPENAI did everything to make your life easier, " +
                "so why don't you try it out? Crazy stuff ooooo";
        Map<String, ArrayList<Integer>> wordLocations = new LinkedHashMap<>();
        List<String> words = new LinkedList<>();
        String[] wordsA = wordsStr.toLowerCase().split("\\W+");
        System.out.println(wordsA);
        words.addAll(List.of(wordsA));
        System.out.println("Words in file: " + words);

        int count = 0;
        for (String word : words) {
            count++;
            if (!wordLocations.containsKey(word)) {
                ArrayList<Integer> locations = new ArrayList<>();
                locations.add(count);
                wordLocations.put(word, locations);
            } else {
                wordLocations.get(word).add(count);
            }
        }
        System.out.println("Map of word locations: " + wordLocations);

        System.out.println("Start from this point by using the result container");
        List<String> result = new ArrayList<>();
        int counter = 1;
        for(int i = 0; i < wordLocations.size(); i++){
            for(int j = 0; j < wordLocations.get(i).size();i++){

            }
        }

    }
}
