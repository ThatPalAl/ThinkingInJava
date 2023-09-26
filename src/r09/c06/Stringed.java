package r09.c06;

public class Stringed extends Instrument implements Playable{

    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println("Tuning the Stringed object.");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}
