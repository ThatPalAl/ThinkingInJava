package r09.c11;

public class DiceFactory implements FlipFactory {

    @Override
    public Flip getFlip() {
        return new Dice();
    }
}
