package r09.c06;

public class Brass extends Wind implements Playable{

    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    public String what() {
        return "Brass";
    }

    @Override
    public String toString() {
        return "Brass";
    }
}
