package r08.examples.e3;

public class Wind extends Instrument {

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
