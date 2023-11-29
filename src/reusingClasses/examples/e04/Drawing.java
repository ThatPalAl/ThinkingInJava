package reusingClasses.examples.e04;

public class Drawing extends Art {
    public Drawing() {
        System.out.println("Drawing's class constructor");
    }

    public static Drawing returnDrawing(){
        System.out.println("return drawing method: ");
        return new Drawing();
    }
}
