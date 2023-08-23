package r08.examples.e3;

public class Stringed extends Instrument {

    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println("Tuning the Stringed object.");
    }
}
