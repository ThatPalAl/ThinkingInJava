package R05.E06;

public class MethodInit2 {
    int i = f();
    int j = g(i);
    int f() {
        System.out.println("Method Init 2 - F");
        return  11;
    }

    int g(int n){
        System.out.println("Method Init 2 - G");
        return n * 10;
    }
}

