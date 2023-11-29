package interfaces.c10;

public class Bicycle implements Cycle{
    public Bicycle() {
    }

    @Override
    public void cycle() {
        System.out.println("Bicycle - 2 circles moving");
    }
}
