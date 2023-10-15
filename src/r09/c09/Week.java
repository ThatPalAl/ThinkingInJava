package r09.c09;

public class Week implements Days {
    private static int count = 0;
    private int id = count++;

    public Week() {
        System.out.println("Week() " + id);
    }
}
