package accessControl.Examples.E15;

public class OverloadingVarargs2 {
    static void f1(Character... args){
        System.out.print("First: ");
        for(Character c : args){
            System.out.print(c+ " ");
        }
        System.out.println();
    }

    static void f1(float f, Character... args){
        System.out.print("Second: " + f + " ");
        for(Character c : args){
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        f1(1, 'a');
//        f1('a','b');

    }
}
