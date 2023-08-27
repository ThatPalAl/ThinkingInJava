package r08.examples.e08;

public class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Creating object (Description) " + s);
    }

    protected void dispose(){
        System.out.println("Removing object (Description) " + s);
    }

    @Override
    public String toString() {
        return s;
    }
}
