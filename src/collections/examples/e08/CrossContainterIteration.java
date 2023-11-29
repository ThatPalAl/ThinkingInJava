package collections.examples.e08;

import collections.examples.e06.Pet;

import java.util.*;

public class CrossContainterIteration {
    public static void display(Iterator<Pet> it){
        int id = 0;
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(id + ":" + p + " ");
            id++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>(8);
        Pet cat = new Pet("Cat");
        Pet mouse = new Pet("Mouse");
        Pet rabbit = new Pet("rabbit");
        Pet gorilla = new Pet("gorilla");
        Pet shark = new Pet("shark");
        Pet elephant = new Pet("elephant");
        pets.add(cat);
        pets.add(mouse);
        pets.add(gorilla);
        pets.add(rabbit);
        pets.add(shark);
        pets.add(elephant);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS = new HashSet<Pet>(pets);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());

    }
}
