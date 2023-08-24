package r08.examples.e01;

import static r08.examples.e01.Music.tune;

public class Main {
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
        Music.tune(flute);
        BothHandedWind saxophone = new BothHandedWind();
        Music.tune(saxophone);
    }
}
