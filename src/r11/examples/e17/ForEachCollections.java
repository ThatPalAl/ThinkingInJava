package r11.examples.e17;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "No place like home".split(" "));
        for(String s : cs){
            System.out.print(s + " ");
        }
    }
}
