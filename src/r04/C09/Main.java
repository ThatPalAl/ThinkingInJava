package r04.C09;

public class Main {
    public static void main(String[] args) {
        fib(12);
    }

    public static int fib(int val){
        int a = 0, b = 1, c, i;
        if(val == 0){
            return a;
        }
        else{
            for(i = 2; i <= val; i++){
                c = a + b;
                a = b;
                b = c;
                System.out.print(b + " ");
            }
            return b;
        }
    }
}
