package r11.c24;

import java.util.PriorityQueue;
import java.util.Random;

public class DoublePQ {
    public static void main(String[] args) {
        Random rand = new Random(47);
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        for(int i = 0; i < 20; i++){
            doubles.offer(rand.nextDouble(i + 5 * 10));
        }
        System.out.println(doubles);

        while(doubles.size() > 0){
            System.out.print(doubles.poll() + " ");
        }

        System.out.println(doubles);
    }
}
