package r09.examples.e13;

public class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}
