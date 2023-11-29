package polymorphism.c05;

public class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int nrOfWheels = 3;

    @Override
    public String toString() {
        return name + " with " + nrOfWheels + " wheels";
    }
}
