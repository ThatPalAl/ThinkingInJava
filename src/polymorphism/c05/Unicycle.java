package polymorphism.c05;

public class Unicycle extends Cycle {
    private String name = "Unicycle";
    private int nrOfWheels = 4;

    public void balance(){

    }
    @Override
    public String toString() {
        return name + " with " + nrOfWheels + " wheels";
    }
}
