package r08.examples.e10;

public class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw(){
        System.out.println("RoundGlyph().draw(), radius = " + radius);
    }


}
