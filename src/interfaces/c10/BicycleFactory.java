package interfaces.c10;

public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
