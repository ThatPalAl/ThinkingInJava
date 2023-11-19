package r11.examples.e09;

import r11.examples.e06.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        Pet dog = new Pet("Dog");
        Pet cat = new Pet("Cat");
        Pet mouse = new Pet("Mouse");
        Pet rabbit = new Pet("rabbit");
        Pet gorilla = new Pet("gorilla");
        Pet shark = new Pet("shark");
        Pet elephant = new Pet("elephant");
        Pet hamster = new Pet("hamster");
        Pet pigeon = new Pet("pigeon");

        addPets(pets, cat, mouse, rabbit, dog, gorilla, shark, elephant, hamster, pigeon);

        ListIterator<Pet> petListIteration = pets.listIterator();
        while (petListIteration.hasNext()) {
            System.out.print(petListIteration.next() + ". Next index: " + petListIteration.nextIndex() +
                    ". Prev index: " + petListIteration.previousIndex() + ": ");
            System.out.println();
        }

        while(petListIteration.hasPrevious()){
            System.out.print(petListIteration.previous().id() + " ");
        }

        System.out.println();
        System.out.println(pets);

        petListIteration = pets.listIterator(5);
        while(petListIteration.hasNext()){
            System.out.print(petListIteration.next() + " ");
        }

    }

    public static void addPets(List<Pet> pets, Pet cat, Pet mouse, Pet rabbit, Pet dog, Pet gorilla, Pet shark, Pet elephant, Pet hamster, Pet pigeon) {
        pets.add(cat);
        pets.add(mouse);
        pets.add(rabbit);
        pets.add(dog);
        pets.add(gorilla);
        pets.add(shark);
        pets.add(elephant);
        pets.add(hamster);
        pets.add(pigeon);
    }
}
