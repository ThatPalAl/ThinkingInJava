package collections.examples.e10;

import collections.examples.e06.Pet;

import java.util.LinkedList;

import static collections.examples.e09.ListIteration.addPets;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>();
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
        System.out.println(pets);

//        identical
        System.out.println("pets.getFirst() " + pets.getFirst());
        System.out.println("pets.element() " + pets.element());
//        differ only by behavior when collection is empty
        System.out.println("pets.peek() " + pets.peek());
//        identical: return and remove first element:
        System.out.println("pets.remove() " + pets.remove());
        System.out.println("pets.removeFirst() " + pets.removeFirst());
//        differ only by behavior when collection is empty:
        System.out.println("pets.poll() " + pets.poll());
        System.out.println(pets);

        System.out.println("Now the empty list: ");
        LinkedList<Pet> petsEmpty = new LinkedList<>();
//        System.out.println("petsEmpty.getFirst() " + petsEmpty.getFirst()); // wont compile on empty LL
//        System.out.println("petsEmpty.element() " + petsEmpty.element()); // wont compile on empty LL
//        differ only by behavior when collection is empty
        System.out.println("petsEmpty.peek() " + petsEmpty.peek());
//        identical: return and remove first element:
//        System.out.println("petsEmpty.remove() " + petsEmpty.remove()); // wont compile on empty LL
//        System.out.println("petsEmpty.removeFirst() " + petsEmpty.removeFirst()); // wont compile on empty LL
//        differ only by behavior when collection is empty:
        System.out.println("petsEmpty.poll() " + petsEmpty.poll()); //return null

        Pet rat = new Pet("Rat");
        pets.addFirst(rat);
        System.out.println("After pets.addFirst() " + pets);
        Pet snake = new Pet("Snake");
        pets.offer(snake);
        System.out.println("After pets.offer() " + pets);
        Pet spider = new Pet("Spider");
        pets.add(spider);
        System.out.println("After pets.add() " + pets);
        Pet tiger = new Pet("Tiger");
        pets.addLast(tiger);
        System.out.println("After pets.addLast() " + pets);
        System.out.println("pets.removeLast() " + pets.removeLast());
    }
}
