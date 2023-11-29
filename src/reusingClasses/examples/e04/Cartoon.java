package reusingClasses.examples.e04;

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon's class constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
        Drawing.returnDrawing();
    }
}
