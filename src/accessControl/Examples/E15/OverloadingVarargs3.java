package accessControl.Examples.E15;

public class OverloadingVarargs3 {
    static void f2(float f, Character... args){
        System.out.print("First: " + f + " ");
        for(Character c : args){
            System.out.println(c + " ");
        }
        System.out.println();
    }

    static void f2(char c, Character... args){
        System.out.print("Second " + c  + " ");
        for(Character ch : args){
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f2(1, 'a');
        f2('a', 'b');
    }
}
