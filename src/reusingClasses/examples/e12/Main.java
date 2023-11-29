package reusingClasses.examples.e12;

public class Main {
    public static void main(String[] args) {
        Orc orc1 = new Orc("Hebz", 1);
        System.out.println(orc1);
        orc1.change("Vaour", 3);
        System.out.println(orc1);
    }
}
