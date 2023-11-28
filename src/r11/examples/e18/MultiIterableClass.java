package r11.examples.e18;

import r11.examples.e17.IterableClass;

import java.util.*;

public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int current = words.length - 1;
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };

    }
    public Iterable<String> randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        System.out.println("Normal:");
        for(String s : mic){
            System.out.print(s + " ");
        }
        System.out.println("\nReversed:");
        for(String s : mic.reversed()){
            System.out.print(s + " ");
        }
        System.out.println("\nRandomized:");
        for(String s : mic.randomized()){
            System.out.print(s + " ");
        }

    }
}
