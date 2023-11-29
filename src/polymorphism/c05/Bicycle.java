package polymorphism.c05;

public class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int nrOfWheels = 2;

    public void balance(){
        System.out.println("Bicycle balance");

    }

    @Override
    public String toString() {
        return name + " with " + nrOfWheels + " wheels";
    }
}
