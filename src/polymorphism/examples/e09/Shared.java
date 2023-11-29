package polymorphism.examples.e09;

public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("creating " + this);
    }

    public void addRef(){
        refcount++;
    }

    protected void dispose(){
        if(--refcount ==0){
            System.out.println("removing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}
