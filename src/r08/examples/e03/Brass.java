package r08.examples.e03;

public class Brass extends Wind {

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
