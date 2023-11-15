package r11.examples.e07;

import r11.examples.e06.Pet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>(12);
        Pet dog = new Pet("Dog");
        Pet cat = new Pet("Cat");
        Pet mouse = new Pet("Mouse");
        Pet rabbit = new Pet("rabbit");
        Pet gorilla = new Pet("gorilla");
        Pet shark = new Pet("shark");
        Pet elephant = new Pet("elephant");
        Pet pigeon = new Pet("pigeon");
        Pet hamster = new Pet("hamster");
        pets.add(dog);
        pets.add(cat);
        pets.add(mouse);
        pets.add(gorilla);
        pets.add(rabbit);
        pets.add(shark);
        pets.add(elephant);
        pets.add(pigeon);
        pets.add(hamster);

        Iterator<Pet> it = pets.iterator();
        int id = 0;
        while(it.hasNext()){
            Pet p = it.next();
            System.out.println(id + ":" + p + " ");
            id++;
        }

        for (Pet p :pets) {
            System.out.println(p + " i");
        }
    }
}
