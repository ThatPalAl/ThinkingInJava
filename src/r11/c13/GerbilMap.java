package r11.c13;

import r11.c01.Gerbil;

import java.util.*;

public class GerbilMap {
    public static void main(String[] args) {
        Gerbil gerbil1 = new Gerbil(1);
        Gerbil gerbil2 = new Gerbil(2);
        Gerbil gerbil3 = new Gerbil(3);
        Gerbil gerbil4 = new Gerbil(4);

        Map<Gerbil, String> gerbils = new HashMap<>();
        gerbils.put(gerbil1, "Gonek");
        gerbils.put(gerbil2, "Lolek");
        gerbils.put(gerbil3, "Bolek");
        gerbils.put(gerbil4, "Kolek");
        List<Gerbil> gerbilList = gerbils.keySet().stream().toList();
        System.out.println("gerbilList : " + gerbilList);
        ListIterator<Gerbil> listIterator = gerbilList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next() + " ");
        }

        for (Gerbil g : gerbilList) {
            System.out.println(g+ " " + gerbils.get(g));
            g.hop();
        }
    }
}
