package collections.c07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RodentExt> rodents = new ArrayList<>();
        RodentExt hamster = new RodentExt("Hamster");
        RodentExt mouse = new RodentExt("Mouse");
        RodentExt rat = new RodentExt("Rat");

        rodents.add(hamster);
        rodents.add(mouse);
        rodents.add(rat);
        RodentExt guineaPig = new RodentExt("Guinea Pig");
        rodents.add(guineaPig);
        Iterator<RodentExt> it = rodents.iterator();
//      You can't add another values to the collection, and iterate within it, if the Iterator class object,
//      is already assigned to a collection, every further modification will result in errors.
//      rodents.add(guineaPig); <- Forbidden
        System.out.println("All rodents, that we store: ");
        while(it.hasNext()){
            System.out.println(it.next().toString() + " ");
        }
    }
}
