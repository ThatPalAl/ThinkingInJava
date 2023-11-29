package reusingClasses.examples.e01;

public class SprinklerSystem {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString(){
        return
                        "\n value1 = " + value1 + " " +
                        "\n value2 = " + value2 + " " +
                        "\n value3 = " + value3 + " " +
                        "\n value4 = " + value4 + " " +
                        "\n i = " + i +
                        "\n j = " + f +
                        "\nsource = "  + source;
    }

    public static void main(String[] args) {

    }
}
