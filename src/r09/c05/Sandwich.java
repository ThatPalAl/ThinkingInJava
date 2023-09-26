package r09.c05;

public class Sandwich extends PortableLunch implements FastFood {
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
