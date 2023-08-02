package r06.examples.e01;
import static r06.examples.e02.Print.*;

public class Main {
    public static void main(String[] args) {
        print("Here it is");
        print(100);
        print(100l);
        printf("Hi", 3.14159);
        printnb(new String("text"));
        printf("Hello:" + 100);
    }
}
