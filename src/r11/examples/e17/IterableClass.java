package r11.examples.e17;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{
    protected String[] words = ("and that's how we know, that earth is in SHape of orange".toLowerCase().split(" "));
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(String s : new IterableClass()){
            System.out.print(s + " ");
        }
    }
}
