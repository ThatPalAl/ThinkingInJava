package r11.examples.e15;

import r11.examples.e14.QueueDemo;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        Random rand = new Random(47);
        pq.offer(31);
        for(int i = 0; i < 9; i++){
            pq.offer(rand.nextInt(i + 10));
        }
        System.out.println(pq);
        QueueDemo.printQ(pq);
        System.out.println("pq: " + pq);

        System.out.println("------------");
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        pq = new PriorityQueue<>(ints);
//        System.out.println(pq);
        QueueDemo.printQ(pq);

        pq = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
        pq.addAll(ints);
//        System.out.println(pq);
        QueueDemo.printQ(pq);

        String fact = "WORK HARD -- PLAY HARD";
        List<String> toRemove = Arrays.asList(" ", ",", ".", "-");
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        stringPQ.removeAll(toRemove);
        QueueDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<>();
        for(char c : fact.toCharArray()){
            charSet.add(c);
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        characterPQ.remove(' ');
        QueueDemo.printQ(characterPQ);

        characterPQ = new PriorityQueue<>(charSet.size(), Collections.reverseOrder());
        characterPQ.addAll(charSet);
        QueueDemo.printQ(characterPQ);
     }
}
