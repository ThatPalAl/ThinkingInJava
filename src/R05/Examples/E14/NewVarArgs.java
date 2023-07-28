package R05.Examples.E14;

public class NewVarArgs {
    public static void printArrar(Object... args){
        for(Object obj : args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "NewVarArgs{}";
    }
}
