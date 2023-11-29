package polymorphism.examples.e08;

public class Characteristic {
    private String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Creating object (Characteristic) " + s);
    }

    protected void dispose(){
        System.out.println("Removing Characteristic " + s);
    }

    @Override
    public String toString() {
        return s;
    }
}
