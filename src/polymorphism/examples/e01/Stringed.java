package polymorphism.examples.e01;

public class Stringed extends Instrument {
    public void play(Note n){
        System.out.println("Stringed.play()" + n);
    }

}
