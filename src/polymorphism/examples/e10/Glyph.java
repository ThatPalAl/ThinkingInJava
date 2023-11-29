package polymorphism.examples.e10;

public class Glyph {
    void draw(){
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Glyph() before draw");
        draw();
        System.out.println("Glyph() after draw");
    }
}
