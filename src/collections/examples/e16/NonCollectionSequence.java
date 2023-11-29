package collections.examples.e16;

import collections.examples.e06.Pet;

import java.util.*;

public class NonCollectionSequence extends PetSequence implements Iterable<Pet>{

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };

    }

    public Iterable<Pet> reversed(){
        System.out.println("\nReversed");
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int current = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized(){
        System.out.println("\nRandomized:");
        return new Iterable<Pet>() {
            Random rand = new Random(47);
            @Override
            public Iterator<Pet> iterator() {

                List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, rand);
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
        InterfaceVsIterator.display(List.of(nc.pets));
        InterfaceVsIterator.display(nc.reversed());
        InterfaceVsIterator.display(nc.randomized());
    }
}
