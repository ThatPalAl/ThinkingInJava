package initalization_cleanUp.c02;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 25; i++){
            int val = rand.nextInt(50);
            int val2 = rand.nextInt(50);
            if(val > val2) {
                System.out.println(val + " > " + val2);
            }
        }
    }
}
