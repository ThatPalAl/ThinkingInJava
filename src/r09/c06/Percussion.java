package r09.c06;

public class Percussion extends Instrument implements Playable{

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
