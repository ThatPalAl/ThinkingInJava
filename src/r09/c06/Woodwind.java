package r09.c06;

public class Woodwind extends Wind implements Playable{

    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String what() {
        return "Woodwind";
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}
