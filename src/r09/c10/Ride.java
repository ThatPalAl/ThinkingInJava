package r09.c10;

public class Ride {
    public static void rollCycle(CycleFactory factory){
        Cycle r = factory.getCycle();
        r.cycle();
    }


    public static void main(String[] args) {
        rollCycle(new UnicycleFactory());
        rollCycle(new TricycleFactory());
        rollCycle(new BicycleFactory());
    }
}
