package r09.examples.e01;

public class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println("Woodwind.adjust()");
    }
}

