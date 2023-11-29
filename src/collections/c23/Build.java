package collections.c23;

import java.util.LinkedList;
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
