package r08.c01;

public class Biking {
    private static void ride(Cycle c){
        System.out.print("riding on ");
        System.out.println(c);
    }

    public static void main(String[] args) {
        Cycle bicycle = new Bicycle();
        ride(bicycle);
        System.out.println("nr of wheels " + bicycle.wheels());
    }
}
