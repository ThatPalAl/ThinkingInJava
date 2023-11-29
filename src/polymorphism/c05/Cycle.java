package polymorphism.c05;

public class Cycle {
    private String name = "Cycle";
    private int nrOfWheels = 1;

    public int wheels(){
        return nrOfWheels;
    }
    @Override
    public String toString() {
        return name + " with " + nrOfWheels + " wheels";
    }

}
