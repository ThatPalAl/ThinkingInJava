package r11.c23;

import java.util.List;
import java.util.Queue;

public class OperateOnCommand {
    public static void commandEater(Queue<Command> queue){
        for (Command c : queue) {
            c.operation();
        }
    }
}
