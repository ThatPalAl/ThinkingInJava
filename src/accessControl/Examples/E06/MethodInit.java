package accessControl.Examples.E06;

public class MethodInit {
    int i = f();

    int f(){
        System.out.println("MethodInit one - F");
        return 11;
    }
}
