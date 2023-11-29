package collections.c25;

import collections.examples.e06.Pet;
import collections.examples.e16.InterfaceVsIterator;

import java.util.Collection;
import java.util.Iterator;

public class CollectionSequenceModified implements Collection {
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

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
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

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public static void main(String[] args) {
            collections.examples.e16.CollectionSequence c = new collections.examples.e16.CollectionSequence();
            InterfaceVsIterator.display(c);
            InterfaceVsIterator.display(c.iterator());
            Pet dog = new Pet("Dog");
            System.out.println(c.remove(dog));
        }

    }

