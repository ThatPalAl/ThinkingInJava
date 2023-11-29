package collections.examples.e01;

public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}

class Orange{

}
