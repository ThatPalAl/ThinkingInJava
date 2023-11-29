package reusingClasses.examples.e15;

public class BlankFinal {
    private final int i = 0; //declaring and initializing final variable
    private final int j; // empty final variable
    private final Poppet p; //empty final reference

    public BlankFinal() {
        j = 1; //initializing empty final variable
        p = new Poppet(1); //initializing empty final reference variable
    }

    public BlankFinal(int x) {
        j = x; // -||-
        p = new Poppet(x); //-||-
    }
}
