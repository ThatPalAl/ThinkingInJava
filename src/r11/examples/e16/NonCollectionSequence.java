package r11.examples.e16;

import r11.examples.e06.Pet;

import java.util.Iterator;
import java.util.List;

public class NonCollectionSequence extends PetSequence{

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

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
        InterfaceVsIterator.display(List.of(nc.pets));
    }
}
