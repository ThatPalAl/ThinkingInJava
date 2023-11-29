package polymorphism.c01;

public class Bicycle extends Cycle{
    private String name = "Bicycle";
    private int nrOfWheels = 2;

    @Override
    public String toString() {
        return name + " with " + nrOfWheels + " wheels";
    }
}
