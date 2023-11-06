package r09.c11;

public class Coin implements Flip{
    public Coin() {
    }

    @Override
    public void flip() {
        System.out.println("Flip the coin");
    }
}
