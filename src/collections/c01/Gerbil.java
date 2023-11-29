package collections.c01;

public class Gerbil {
    private int gerbilNr;

    public Gerbil(int gerbilNr) {
        this.gerbilNr = gerbilNr;
    }

    public void hop(){
        System.out.println("Gerbil nr: " + gerbilNr);
    }

    @Override
    public String toString() {
        return "Gerbil nr : " + gerbilNr;
    }
}
