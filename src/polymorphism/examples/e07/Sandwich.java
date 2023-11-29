package polymorphism.examples.e07;

public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Lettuce l = new Lettuce();
    private Cheese c = new Cheese();
    private Pickle p = new Pickle();



    public Sandwich() {
    }

    public Sandwich(Bread b, Lettuce l, Cheese c, Pickle p) {
        this.b = b;
        this.l = l;
        this.c = c;
        this.p = p;
    }
}
