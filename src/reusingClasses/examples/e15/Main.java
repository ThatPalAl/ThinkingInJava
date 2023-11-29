package reusingClasses.examples.e15;

public class Main {
    public static void main(String[] args) {
        BlankFinal blankFinal = new BlankFinal();
        new BlankFinal();
        BlankFinal blankFinal1 = new BlankFinal(48);
        new BlankFinal(48);
    }
}
