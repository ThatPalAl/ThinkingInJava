package r11.c10;

import java.util.LinkedList;
import java.util.ListIterator;

public class EmptyContainer {
    static void addMiddle(LinkedList<Integer> ll, Integer[] arr){
        for(Integer i : arr){
            ListIterator<Integer> it = ll.listIterator(ll.size() / 2);
            it.add(i);
        }
        System.out.println(ll);
    }


    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
//        ListIterator<Integer> listIterator = integers.listIterator(integers.size() / 2);

        Integer[] elementsToAdd = {10, 15, 17, 22, 30}; // Elements to be added

//        for (int element : elementsToAdd) {
//            if (listIterator.hasNext()) {
//                listIterator.next();
//            }
//            listIterator.add(element);
//        }
        addMiddle(integers, elementsToAdd);

    }
}
