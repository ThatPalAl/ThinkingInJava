package r08.examples.e09;

public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("removing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}
