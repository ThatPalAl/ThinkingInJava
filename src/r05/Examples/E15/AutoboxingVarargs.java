package r05.Examples.E15;

public class AutoboxingVarargs {
    public static void f(Integer... args){
        for(Integer i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int var1 = 1, var2= 2, var3 = 3, var4 = 4;
//        f(new Integer(1), new Integer(2));
        f(4,5,6,7,8);
        f(10, var1, 12, var2, 14, var3, 16, var4);
//        f(10, new Integer(10), 12);
    }

}
