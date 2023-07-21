package R05.C08;

public class DoubleDecker {

    void firstMethod(){
        System.out.println("Nothing particular");
    }
    void secondMethod(){
        firstMethod();
        this.firstMethod();
    }
}
