package r08.examples.e3;

public class Instrument {
    public void play(Note n){
        System.out.println("Instrument.play()" + n);
    }

    @Override
    public String toString() {
        return "Instrument;";
    }

    String what(){
        return "Instrument";
    }

    public void adjust(){
        System.out.println("tuning the Instrument object");
    }
}
