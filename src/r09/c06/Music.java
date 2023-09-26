package r09.c06;

import java.util.Random;

public class Music {
    static Random random = new Random(1000);
    public static void tune(Playable i){
        switch (random.nextInt(4)) {
            case 1 -> i.play(Note.C_SHARP);
            case 2 -> i.play(Note.MIDDLE_C);
            case 3 -> i.play(Note.B_FLAT);
            default -> i.play(Note.MIDDLE_C);
        }

    }

    public static void tuneAll(Instrument[] arr){
        for (Instrument instrument : arr) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.play(Note.MIDDLE_C);
        System.out.println(instrument.what());
        instrument.adjust();
        tune(instrument);

        System.out.println("----------------------------------------------");

        Brass brass = new Brass();
        brass.play(Note.C_SHARP);
        System.out.println(brass.what());
        brass.adjust();
        tune(brass);

        System.out.println("----------------------------------------------");

        Wind wind = new Wind();
        System.out.println(wind.what());

        System.out.println("----------------------------------------------");

        Instrument[] orchestra = {new Percussion(), new Wind(), new Woodwind(), brass, new Stringed(), new Violin()};
        tuneAll(orchestra);

        System.out.println("----------------------------------------------");

        for (Instrument i: orchestra) {
            System.out.println(i);
        }
    }
}
