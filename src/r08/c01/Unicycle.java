package r08.c01;

public class Unicycle extends Cycle{
    private String name = "Unicycle";
    private int nrOfWheels = 4;

    @Override
    public String toString() {
        return name + " with " + nrOfWheels + " wheels";
    }
}
