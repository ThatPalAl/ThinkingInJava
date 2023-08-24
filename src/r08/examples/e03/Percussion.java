package r08.examples.e03;

public class Percussion extends Instrument {

    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String what() {
        return "Percussion";
    }
    public void adjust() {
        System.out.println("Tuning the Percussion object.");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}
