package r05.c01;

public class Main {
    public static void main(String[] args) {
        StringComponentIsNull object = new StringComponentIsNull();

        if(object.ingredient == null){
            System.out.println("This object, created from a class with default constructor and just one component, " +
                    "is definitely null");
        }
    }
}
