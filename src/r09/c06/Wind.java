package r09.c06;

public class Wind extends Instrument implements Playable{

    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    @Override
    public String what() {
        return super.what();
    }

    public void adjust() {
        System.out.println("Tuning the Wind object.");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}
