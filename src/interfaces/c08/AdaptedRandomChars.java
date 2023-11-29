package interfaces.c08;

import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomChars extends RandomChars implements Readable {
    private int count;

    public AdaptedRandomChars(int count) {
        this.count = count;
    }

    public int read(CharBuffer c){
        if(count-- == 0){
            return -1;
        }
        String result = next() + " ";
        c.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars(150));
        while(s.hasNext()){
            System.out.print(s.next() + " ");
        }
    }
}
