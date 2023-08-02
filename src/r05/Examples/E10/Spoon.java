package r05.Examples.E10;

public class Spoon {
    static int i;
    static {
        i = 47;
    }

    public Spoon(int marker) {
        System.out.println("Spoon(" + marker + ")");
    }
    void f(int i){
        System.out.println("Spoon(" + i + ")");
    }
}
