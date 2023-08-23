package r08.examples.e3;

public class Brass extends Wind {

    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    public String what() {
        return "Brass";
    }
}
