package r09.examples.e01;

public class Wind extends Instrument implements Playable{

    public void play(Note n) {
        System.out.println("Wind.play()  " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}
