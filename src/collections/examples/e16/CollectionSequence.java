package collections.examples.e16;

import collections.examples.e06.Pet;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<Pet> {
    Pet dog = new Pet("Dog");
    Pet cat = new Pet("Cat");
    Pet mouse = new Pet("Mouse");
    Pet rabbit = new Pet("Rabbit");
    Pet gorilla = new Pet("Gorilla");
    Pet shark = new Pet("Shark");
    Pet elephant = new Pet("Elephant");
    Pet hamster = new Pet("Hamster");
    Pet pigeon = new Pet("Pigeon");

    private Pet[] pets = {dog, cat, mouse, rabbit, gorilla, shark, elephant, hamster, pigeon};

    public int size(){
        return pets.length;
    }

    public Iterator<Pet> iterator(){
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {return pets[index++];}
            public void remove(){
                throw new UnsupportedOperationException();
            } //unimplemented

        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
        Pet dog = new Pet("Dog");
        System.out.println(c.remove(dog));
    }

}
