package r11.c01;

public class Gerbil {
    private int gerbilNr;

    public Gerbil(int gerbilNr) {
        this.gerbilNr = gerbilNr;
    }

    public void hop(){
        System.out.println("Gerbil nr: " + gerbilNr);
    }
}
