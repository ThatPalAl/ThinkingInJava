package r05.Examples.E06;

public class MethodInit3 {
//    int g = g(i); NOT allowed - illegal forward reference
    int i = f();
    int g = g(i);

    int f(){
        System.out.println("Method Init 3 - F");
        return 11;
    }

    int g(int n){
        System.out.println("Method Init 3 - G");
        return n * 10;
    }
}
