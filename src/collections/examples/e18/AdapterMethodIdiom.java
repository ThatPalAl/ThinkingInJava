package collections.examples.e18;


import java.util.Arrays;

public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".toLowerCase()
                .split(" ")));
        System.out.println("Normal:");
        for(String s : ral){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Reversed:");
        for(String s : ral.reversed()){
            System.out.print( s + " ");
        }
    }

}
