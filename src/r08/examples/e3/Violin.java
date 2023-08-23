package r08.examples.e3;

public class Violin extends Stringed {

    public void play(Note n) {
        System.out.println("Violin.play() " + n);
    }
    public String what() {
        return "Violin";
    }

    public String toString() {
        return "Violin";
    }
}
