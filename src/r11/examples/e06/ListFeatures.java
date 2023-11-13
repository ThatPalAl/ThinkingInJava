package r11.examples.e06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(48);
        Pet hamster = new Pet("hamster");
        Pet rabbit = new Pet("rabbit");
        Pet gorilla = new Pet("gorilla");
        Pet shark = new Pet("shark");
        Pet elephant = new Pet("elephant");
        Pet pigeon = new Pet("pigeon");
        Pet mouse = new Pet("mouse");

        List<Pet> pets = new ArrayList<>();
        pets.add(hamster);
        System.out.println(pets.contains(hamster));
        System.out.println(pets.remove(rabbit));
        pets.add(rabbit);
        pets.add(gorilla);
        pets.add(shark);
        System.out.println(pets.get(3));
        System.out.println(pets.isEmpty());
        pets.add(elephant);
        pets.add(pigeon);
        List<Pet> sub = pets.subList(1,4);
        System.out.println(sub.containsAll(pets));
        System.out.println(pets.containsAll(sub));
        System.out.println("sub: " + sub);
        Collections.shuffle(sub, random);
        System.out.println(sub);
        List<Pet> copy = new ArrayList<Pet>(pets);
        System.out.println("copy : " + copy);
        System.out.println("pets: " + pets);
        sub.add(mouse);
        System.out.println("Sub: " + sub);
        copy.retainAll(sub);
        System.out.println("copy: " + copy);
        System.out.println("Sub: " + sub);
        Object[] o = pets.toArray();
        System.out.println("object: " + o[3].toString());
        Pet[] petArray = pets.toArray(new Pet[0]);
        System.out.println("petArray: " + petArray[3]);

    }
}