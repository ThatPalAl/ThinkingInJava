package reusingClasses.examples.e01;

public class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("Water source() ");
        s = "created";
    }

    @Override
    public String toString() {
        return  s;
    }
}
