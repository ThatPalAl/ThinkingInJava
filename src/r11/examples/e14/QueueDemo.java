package r11.examples.e14;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
    public static void printQ(Queue queue){
        while(queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++){
            queue.offer(rand.nextInt(20));
        }
        System.out.println(queue);
        Queue<Character> charQueue = new LinkedList<Character>();
        for(Character c : "Dinosaur".toCharArray()){
            charQueue.offer(c);
        }
        System.out.println(charQueue);
        charQueue.remove();
        System.out.println(charQueue);
        System.out.println(charQueue.peek());
        Queue<Integer> intQueue = new PriorityQueue<>(4);
        intQueue.addAll(queue);
        System.out.println(intQueue);
    }
}
