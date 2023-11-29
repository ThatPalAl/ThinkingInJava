package collections.c23;

import java.util.Queue;

public class OperateOnCommand {
    public static void commandEater(Queue<Command> queue){
        for (Command c : queue) {
            c.operation();
        }
    }
}
