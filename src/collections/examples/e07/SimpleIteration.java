package collections.examples.e07;

import collections.examples.e06.Pet;
import collections.examples.e09.ListIteration;

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
        ListIteration.addPets(pets, dog, cat, mouse, gorilla, rabbit, shark, elephant, pigeon, hamster);

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
