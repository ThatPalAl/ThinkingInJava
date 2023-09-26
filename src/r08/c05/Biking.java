package r08.c05;

public class Biking {
    private static void ride(Cycle c){
        System.out.print("riding on ");
        System.out.println(c);
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] cycles = {bicycle, unicycle, tricycle};
        for (Cycle c: cycles) {
            ((Bicycle)c).balance();
        }

    }
}
