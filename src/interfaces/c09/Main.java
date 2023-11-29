package interfaces.c09;

public class Main implements InterfaceAsEnum {
    public static void main(String[] args) {
        System.out.println(InterfaceAsEnum.JULY);
        System.out.println(EnumExample.JULY);

        //Days and weeks
        System.out.println("Monday = " + Days.MONDAY);
        System.out.println("Sunday = " + Days.SUNDAY);
        Week w0 = new Week();
        Week w1 = new Week();
        //w1.MONDAY = w0.MONDAY; -- cannot assign a variable to final instance

        //proving that all the fields from interfaces are static and final (undirectly)

    }
}
