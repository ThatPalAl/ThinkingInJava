package r09.c11;

public class Play {
    public static void play(FlipFactory flipFactory){
         Flip f = flipFactory.getFlip();
         f.flip();
    }

    public static void main(String[] args) {
        Play.play(new DiceFactory());
        Play.play(new CoinFactory());

    }
}
