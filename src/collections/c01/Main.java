package collections.c01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gerbil gerbil1 = new Gerbil(1);
        Gerbil gerbil2 = new Gerbil(2);
        Gerbil gerbil3 = new Gerbil(3);

        ArrayList<Gerbil> gerbilParam = new ArrayList<>();
        gerbilParam.add(gerbil1);
        gerbilParam.add(gerbil2);
        gerbilParam.add(gerbil3);
        System.out.println("For each loop:");
        for(Gerbil g : gerbilParam){
            g.hop();
        }

        System.out.println("For loop: ");
        for(int i = 0; i < gerbilParam.size(); i++){
            gerbilParam.get(i).hop();
        }

        ArrayList gerbilNonParam = new ArrayList();
        gerbilNonParam.add(gerbil1);
        gerbilNonParam.add(gerbil2);
        gerbilNonParam.add(gerbil3);
        for(Object obj : gerbilNonParam) {
//            obj.hop()
        }
        System.out.println("\nArrays as list ");
        System.out.println(Arrays.asList(gerbil1, gerbil2, gerbil3, gerbil1));
        System.out.println(Arrays.asList(gerbilParam));
    }
}
