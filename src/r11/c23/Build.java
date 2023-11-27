package r11.c23;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Build {
    public Queue<Command> FillQueue(){
        Queue<Command> queue = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            queue.offer(new Command(i + " "));
        }
        return queue;
    }
}
