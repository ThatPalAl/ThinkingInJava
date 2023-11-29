package interfaces.examples.e01;

public class Percussion extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String what(){
        return "Percussion";
    }
    @Override
    public void adjust() {

    }
}
