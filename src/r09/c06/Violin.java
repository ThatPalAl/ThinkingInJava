package r09.c06;

public class Violin extends Stringed implements Playable{

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
