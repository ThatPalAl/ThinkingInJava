package r09.c11;

public class CoinFactory implements FlipFactory{
    @Override
    public Flip getFlip() {
        return new Coin();
    }
}
