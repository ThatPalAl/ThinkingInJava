package interfaces.c11;

public class Dice implements Flip{
    @Override
    public void flip() {
        System.out.println("Flip the dice");
    }
}
