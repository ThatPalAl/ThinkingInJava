package r05.Examples.E15;

public class OverloadingVarargs {
    static void f(Character... args){
        System.out.print("First ");
        for(Character c: args){
            System.out.print(c + " ");
        }
        System.out.println();
    }

    static void f(Integer... args){
        System.out.print("Second ");
        for(Integer i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void f(Long... args){
        System.out.print("Third ");
        for(Long l : args){
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f('a','b','c');
        f(1);
        f(2, 1);
        f(1234123321312L);
        f(0L);
        f(Long.getLong("1223123132"));
//        f();

    }

}
