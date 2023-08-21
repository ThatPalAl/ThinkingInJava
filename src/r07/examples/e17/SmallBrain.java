package r07.examples.e17;

public class SmallBrain {
}

final class Dinosaur {

    int i = 7;
    final int j = 1;

    SmallBrain x = new SmallBrain();

    public Dinosaur() {
    }

    public Dinosaur(int i, SmallBrain x) {
        this.i = i;
        this.x = x;
    }

    void f(){
        System.out.println("Dinosaur class");
    }
}
