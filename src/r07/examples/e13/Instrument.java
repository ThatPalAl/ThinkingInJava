package r07.examples.e13;

public class Instrument {
    public void play(){
        System.out.println("playing");
    };
    public static void tune(Instrument i){
        System.out.println("Tune of "  + i);
        i.play();
    }
}
