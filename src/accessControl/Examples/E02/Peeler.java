package accessControl.Examples.E02;

public class Peeler {
    static Apple peel(Apple apple ){
        System.out.println("Apple is being peeled, it will be done when the counter stops.");
        for(int i = 5; i > 0; i--){
            System.out.print(i + "...");
        }
        System.out.println();
        return apple;
    }
}
