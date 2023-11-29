package interfaces.examples.e01;

public class Main implements Playable {
    static void tune(Instrument i){
        i.play(Note.C_SHARP);
    }

    static void tuneAll(Instrument[] e){
        for (Instrument i :e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
        };
        tuneAll(orchestra);



    }
}
